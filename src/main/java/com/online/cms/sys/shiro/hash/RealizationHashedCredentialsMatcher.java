package com.online.cms.sys.shiro.hash;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 限制登录次数
 * @author wangzewen
 *
 */
public class RealizationHashedCredentialsMatcher extends HashedCredentialsMatcher {

	private Cache<String, AtomicInteger> passwordRetryCache;

	public RealizationHashedCredentialsMatcher(CacheManager cacheManager) {
		passwordRetryCache = cacheManager.getCache("passwordRetryCache");
	}
	//spring 中必须加入 默认无参的构造函数 不然会报  No default constructor found
	public RealizationHashedCredentialsMatcher() {}

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		String username = (String) token.getPrincipal();
		System.out.println("retryCount="+username);
		
		// retry count + 1
		AtomicInteger retryCount = passwordRetryCache.get(username);
		if (retryCount == null) {
			retryCount = new AtomicInteger(0);
			passwordRetryCache.put(username, retryCount);
		}
		if (retryCount.incrementAndGet() > 5) {
			// if retry count > 5 throw
			throw new ExcessiveAttemptsException();
		}

		boolean matches = super.doCredentialsMatch(token, info);
		if (matches) {
			// clear retry count
			passwordRetryCache.remove(username);
		}
		return matches;
	}
}
