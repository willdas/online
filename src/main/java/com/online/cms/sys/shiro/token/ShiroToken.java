package com.online.cms.sys.shiro.token;

import java.io.Serializable;
import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 重写父类的password
 * @author wangzewen
 *
 */
public class ShiroToken extends UsernamePasswordToken implements Serializable{

	private static final long serialVersionUID = 7872658587792269514L;
    
	public ShiroToken(String username,String pwd) {
		super(username,pwd);
		this.pwd = pwd;
	}

	private String pwd;
	
	public String getPwd() {
		return pwd;
	}

	public void setPassword(String pwd) {
		this.pwd = pwd;
	}

}
