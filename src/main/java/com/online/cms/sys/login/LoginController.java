package com.online.cms.sys.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.online.cms.sys.shiro.token.ShiroToken;
import org.apache.shiro.authc.AuthenticationException; 
/**
 * 登录后台
 * @author willdas
 *
 */
@Controller
@RequestMapping("/eBookLogin")
public class LoginController {
	
	/**
	 * 进入管理员登录页面
	 * @return 
	 * 使用不规则命名—>防止后台扫描软件扫到后台路径
	 */
	@RequestMapping("/eb/loginManagement.html")
	public String login(){
		return "jsp/login/login";
	}
	
	/**
	 * 登录成功并进入后台管理页面
	 * @return
	 */
	@RequestMapping(value="/loginManagentPage.do",method=RequestMethod.POST)
	public String login(String username,String password,HttpSession session,HttpServletRequest request){
		String requestUrl = "";
		String passwordMd5Hash = new Md5Hash(password).toHex();
		ShiroToken token = new ShiroToken(username,passwordMd5Hash);
		token.setRememberMe(true);
		// 获取当前的Subject
		Subject subject = SecurityUtils.getSubject();
		try {
			//在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查  
	        //每个Realm都能在必要时对提交的AuthenticationTokens作出反应  
	        //所以这一步在调用login(token)方法时,它会走到MyRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法  
			subject.login(token);
			requestUrl = "jsp/managePage/backstageManagePage";
		} catch(UnknownAccountException uae){  
            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,账户不存在");  
            request.setAttribute("message_login", "账户不存在");  
            requestUrl = "redirect:/eBookLogin/eb/loginManagement.html";
        }catch(IncorrectCredentialsException ice){  
            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误的凭证");  
            request.setAttribute("message_login", "密码不正确");  
            requestUrl = "redirect:/eBookLogin/eb/loginManagement.html";
        }catch(LockedAccountException lae){  
            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,账户已锁定");  
            request.setAttribute("message_login", "账户已锁定"); 
            requestUrl = "redirect:/eBookLogin/eb/loginManagement.html";
        }catch(ExcessiveAttemptsException eae){  
            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误次数过多");  
            request.setAttribute("message_login", "用户名或密码错误次数过多");  
            requestUrl = "redirect:/eBookLogin/eb/loginManagement.html";
        }catch(AuthenticationException ae){  
            //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景  
            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,用户名或密码不正确");  
            request.setAttribute("message_login", "用户名或密码不正确");
            requestUrl = "redirect:/eBookLogin/eb/loginManagement.html";
        } 
		
		//验证是否登录成功  
        if(subject.isAuthenticated()){
        	// 跳转到用户之前访问的页面
            System.out.println("用户[" + username + "]登录认证通过");  
        }else{  
            token.clear();  
        }
		return requestUrl;
	}
	
	/**
	 * 退出登录
	 * @param request
	 */
	@RequestMapping("/loginout.do")
	public String loginout(HttpServletRequest request){
		SecurityUtils.getSubject().logout();
		// 返回登录页
		return "redirect:/eBookLogin/eb/loginManagement.html";
	}
}
