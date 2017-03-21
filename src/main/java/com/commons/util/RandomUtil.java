package com.commons.util;

import java.util.Random;

/**
 * 生成指定范围的随机数
 * @author willdas
 *
 */
public class RandomUtil {
	
	public static void createRadom(){
		int max = 899999999;
		Random random = new Random();
		int count = random.nextInt(max);
		System.out.println(count + 100000);
	}
	
	public static void main(String[] args) {
		createRadom();
	}
}
