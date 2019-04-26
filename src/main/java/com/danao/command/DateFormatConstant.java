package com.danao.command;


/**
 * 该类的作用是:
 * 1.时间格式枚举类
 * @author zhangym
 * @date 2019-02-12
 * @version 1.0
 * @since 1.0
 *
 */
public enum DateFormatConstant {

	/**
	 * 时间格式:yyyy-MM-dd HH:mm:ss
	 *eg: 2019-01-01 00:00:00
	 */
	DATE_TIME_PATTERN("yyyy-MM-dd HH:mm:ss"),
	/**
	 * 时间格式:yyyy-MM-dd HH:mm
	 *eg: 2019-01-01 00:00
	 */
	MINUTE_PATTERN("yyyy-MM-dd HH:mm"),
	/**
	 * 时间格式:yyyy-MM-dd HH:mm:ss
	 *eg: 2019-01-01 00:00:00
	 */
	HOUR_PATTERN("yyyy-MM-dd HH:mm:ss"),
	/**
	 * 时间格式:yyyy-MM-dd
	 *eg: 2019-01-01
	 */
	DATE_PATTERN("yyyy-MM-dd"),
	/**
	 * 时间格式:yyyy-MM
	 *eg: 2019-01
	 */
	MONTH_PATTERN("yyyy-MM"),
	/**
	 * 时间格式:yyyy
	 *eg: 2019
	 */
	YEAR_PATTERN("yyyy"),
	/**
	 * 时间格式:MM
	 *eg: 01
	 */
	MINUTE_ONLY_PATTERN("mm"),
	/**
	 * 时间格式:HH
	 *eg: 00
	 */
	HOUR_ONLY_PATTERN("HH"),

	ERROR_DATE("0000-00-00 00:00:00");

	private String dateFormat;

	private DateFormatConstant(String dateFormat){
		this.dateFormat = dateFormat;
	}


	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
}
