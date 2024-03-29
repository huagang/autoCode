package org.durcframework.autocode.util;

import org.springframework.util.StringUtils;

public class FieldUtil {

	/**
	 * remove the underline. e.x. table_name change to: tableName
	 * 
	 * @param field
	 * @return
	 */
	public static String underlineFilter(String field) {
		if (StringUtils.hasText(field)) {
			StringBuilder sb = new StringBuilder(field);
			while (sb.indexOf("_") > -1) {
				int index = sb.indexOf("_");
				String upperLetter = sb.substring(index + 1, index + 2)
						.toUpperCase();
				sb.replace(index + 1, index + 2, upperLetter);
				sb.deleteCharAt(index);
			}
			return sb.toString();
		}
		return "";
	}

	/**
	 * 将第一个字母转换成大写
	 * 
	 * @param str
	 * @return
	 */
	public static String upperFirstLetter(String str) {
		if (StringUtils.hasText(str)) {
			String firstUpper = str.substring(0, 1).toUpperCase();
			str = firstUpper + str.substring(1, str.length());
		}
		return str;
	}

	
	public static void main(String[] args) {
		System.out.println(underlineFilter("table_name"));
		System.out.println(underlineFilter("tableName"));
		System.out.println(underlineFilter("username"));
	}
	
}
