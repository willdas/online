package com.commons.util;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import com.online.cms.sys.log.accessLog.domain.AccessLog;

/**
 * 保存访问记录工具类
 * @author willdas
 *
 */
public class AccessLogUtil {
	/**
	 * 保存访问记录
	 * @param occupation
	 * @param request
	 */
	public static AccessLog accessLog(String occupation,HttpServletRequest request) {
		//获取ip地址
		String ipAddress = IPUtil.getIpAddress(request);
		AccessLog accessLog = new AccessLog();
		accessLog.setId(IdGen.uuidInt());
		accessLog.setUserId(111);
		accessLog.setUser("admin");
		accessLog.setIpAddress(ipAddress);
		accessLog.setStartTime(new Date());
		accessLog.setAccessContent(occupation);
		return accessLog;
	}
}
