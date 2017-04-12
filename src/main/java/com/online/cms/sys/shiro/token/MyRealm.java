package com.online.cms.sys.shiro.token;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;  
import org.apache.commons.lang3.builder.ToStringStyle;  
import org.apache.shiro.SecurityUtils;  
import org.apache.shiro.authc.AuthenticationException;  
import org.apache.shiro.authc.AuthenticationInfo;  
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;  
import org.apache.shiro.authz.AuthorizationInfo;  
import org.apache.shiro.authz.SimpleAuthorizationInfo;  
import org.apache.shiro.realm.AuthorizingRealm;  
import org.apache.shiro.session.Session;  
import org.apache.shiro.subject.PrincipalCollection;  
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import com.online.cms.sys.role.service.RoleService;
import com.online.cms.sys.rolePermission.domain.RolePermission;
import com.online.cms.sys.user.dao.UserMapper;
import com.online.cms.sys.user.domain.User;
import com.online.cms.sys.user.service.UserService;
import com.online.cms.sys.userRole.dao.UserRoleMapper;
import com.online.cms.sys.userRole.domain.UserRole;  

/**
 * 自定义指定的Shiro验证用户登录的类
 * @author wangzewen
 *
 */
public class MyRealm extends AuthorizingRealm{

	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	/**
	 * 为当前登录的Subject授予角色和权限
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// 获取当前登录的用户名，等价于(String)principals.fromRealm(this.getName()).iterator().next();
		String userName = (String)super.getAvailablePrincipal(principals);
		System.out.println("currentUserName"+userName);
		List<String> roleList = new ArrayList<String>();       // 存放所有角色
		List<String> permissionList = new ArrayList<String>(); // 存放所有权限
		List<UserRole> roles = userService.selectRolesByUserName(userName);  // 所有角色
		if (roles.size() != 0) {
			for (int i = 0; i < roles.size(); i++) {
				roleList.add(roles.get(i).getRoleName());
				List<RolePermission> permissions = roleService.getPermissionsByRoleId(roles.get(i).getRoleId());
				if (permissions.size() != 0) {
					for (int j = 0; j < permissions.size(); j++) {
						permissionList.add(permissions.get(j).getPermissionName());
					}
				}
			}
		}
		System.out.println("roleList="+roleList.toString());
		System.out.println("permissionList="+permissionList.toString());
		
		//为当前用户设置角色和权限
		SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo(); 
		simpleAuthorInfo.addRoles(roleList);
		simpleAuthorInfo.addStringPermissions(permissionList);
		return simpleAuthorInfo;
	}

	/**
	 * 登录
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken){
		// 获取基于用户名和密码的令牌
		// authcToken 是从LoginController里面subject.login(authcToken) 传过来的
		ShiroToken token = (ShiroToken)authcToken;
		User user = userService.login(token.getUsername(),token.getPwd());
		if (user != null) {
			if (user.getEmail().equals(token.getUsername()) && user.getPassword().equals(token.getPwd())) {
				AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getEmail(),user.getPassword(),this.getName());
				this.setSession("user",user);
				return authcInfo;
			}
		}else {
			throw new AuthenticationException();
		}
		return null;
	}

	/**
	 * 将一些数据放到ShiroSession中,以便其他地方使用
	 * 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到 
	 * @param string
	 * @param user
	 */
	private void setSession(Object key, Object value) {
		Subject subject = SecurityUtils.getSubject();
		if (subject != null) {
			Session session = subject.getSession();
			System.out.println("Session默认时间="+session.getTimeout() /1000 /60);
			if (session != null) {
				session.setAttribute(key, value);
			}
		}
	}
}
