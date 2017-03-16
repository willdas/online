package com.online.commons.util;

import java.security.SecureRandom;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public abstract class IdGen {
	@SuppressWarnings("unused")
	private static SecureRandom random = new SecureRandom();
	
	public static String uuid(){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
