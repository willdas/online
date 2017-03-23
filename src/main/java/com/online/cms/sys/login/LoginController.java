package com.online.cms.sys.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("/loginManagentPage.html")
	public String loginIn(HttpServletRequest request){
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		if (user.equals("admin" ) && password.equals("123")) {
			// 登录成功进入后台管理页面
			return "jsp/managePage/backstageManagePage";
		}else{
			//登录失败返回登录页面
			return "redirect:/eBookLogin/eb/loginManagement.html";
		}
	}
	
}
