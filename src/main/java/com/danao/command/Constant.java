package com.danao.command;

/**
 * @author zhang
 * @version 1.0
 * @classname Constant
 * @descriptionclass class describe
 * 1.常量类
 * 2.****************
 * @createdate 2019/4/10
 * @since 1.0
 */
public class Constant {

	public static String LOGFORMATA = "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
	public static String LOGFORMATB = "===============================================================================";
	public static String LOGFORMATC = "-------------------------------------------------------------------------------";
	public static String LOGFORMATD = "*******************************************************************************";


	public static String DATEFORMAT = "yyyy-MM-dd hh:mm:ss";

	public static String getFormatString(Object object,String string){
		return String.format("%s                 %s",object.toString(),string);
	}

	public static void main(String[] args) {
		String s = getFormatString(1234,"asfsafsaf");
		System.out.println(s);
	}

}
