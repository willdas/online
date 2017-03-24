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
	
	public static String uuid(){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
