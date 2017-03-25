package com.commons.util;

import java.security.SecureRandom;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 * UUID 生成工具
 * @author willdas
 *
 */
@Service
public abstract class IdGen {
	@SuppressWarnings("unused")
	private static SecureRandom random = new SecureRandom();
	
	/*
	 * 生成字符串
	 */
	public static String uuidString(){
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	/*
	 * 随机6位数
	 */
	public static int uuidInt() {
		return Math.abs(random.nextInt(1000000));
	}

}
