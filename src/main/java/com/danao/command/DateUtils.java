package com.danao.command;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zhang
 * @version 1.0
 * @classname DateUtils
 * @descriptionclass class describe
 * 1.****************
 * 2.****************
 * @createdate 2019/4/10
 * @since 1.0
 */
public class DateUtils {

	/**
	 * 获取当前时间
	 * 格式为
	 * @return
	 */
	public static String getNow(){
		LocalDateTime time = LocalDateTime.now();
		return getDate(time,DateFormatConstant.DATE_TIME_PATTERN);
	}

	/**
	 * jdk8之后获取时间 线程安全
	 * @param localDateTime
	 * @param dateFormatConstant
	 * @return
	 */
	public static String getDate(LocalDateTime localDateTime,DateFormatConstant dateFormatConstant){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormatConstant.getDateFormat());
		String formattedDateTime = localDateTime.format(formatter);
		System.out.println(formattedDateTime);
		return formattedDateTime;
	}

}
