package com.fan.util;

import java.text.SimpleDateFormat;

/**
 * SQL工具类
 * @author Ming
 *
 */
public class SQLUtil {
	/**
	 * 格式化字段
	 * @param parameters 字段
	 * @return 格式化结果
	 */
	public static String formatParameters(String[] parameters) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(parameters[0]);
		for (int i = 1, length = parameters.length; i < length; i++) {
			stringBuilder.append("," + parameters[i]);
		}
		
		return stringBuilder.toString();
	}
	
	/**
	 * 条件SQL参数填充
	 * @param condition 条件
	 * @param values 参数
	 * @return 条件SQL
	 */
	@SuppressWarnings("deprecation")
	public static String fillCondition(String condition, Object[] values) {
		if (condition == null) {
			return null;
		}
		
		StringBuilder stringBuilder = new StringBuilder(condition);
		
		for (int i = 0, length = values.length; i < length; i++) {
			int index = stringBuilder.indexOf("?");
			Object value = values[i];
			String param;
			if (value instanceof String) {
				param = "'" + ((String) value).replaceAll("'", "''") + "'";
			} else if (value instanceof java.util.Date) {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				param = "'" + simpleDateFormat.format((java.util.Date) value) + "'";
			} else if (value instanceof java.sql.Date) {
				param = "'" + ((java.sql.Date) value).toLocaleString() + "'";
			} else {
				param = value.toString();
			}
			stringBuilder.replace(index, index + 1, param);
		}
		
		return stringBuilder.toString();
	}
	
	public static int getOffset(int curPage, int limit) {
		return (curPage - 1) * limit;
	}
	
	public static void main(String[] args) {
		String[] parameters = new String[] {"username", "password"};
		System.out.println(formatParameters(parameters));
		
		String condition = "username = ? and sex = ? and create_date = ? and update_date = ?";
		Object[] values = new Object[] {"Ming", 1, new java.util.Date(), new java.sql.Date(System.currentTimeMillis())};
		System.out.println(fillCondition(condition, values));
	}
}
