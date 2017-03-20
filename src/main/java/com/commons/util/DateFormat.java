package com.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式转换工具包
 * @author willdas
 *
 */
public class DateFormat{
	/*
	 * 定义日期模版
	 */
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	/*
	 * 将Date格式的日期转换成String格式
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date){
		return sdf.format(date);
	}

	/*
	 * 将String格式的日期转换成Date格式
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date stringToDate(String date) throws ParseException{
		return sdf.parse(date);
	}
	
}
