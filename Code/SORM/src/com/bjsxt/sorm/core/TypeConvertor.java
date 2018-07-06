package com.bjsxt.sorm.core;

/**
 * 负责Java数据类型和数据库类型互相转换
 * @author gaoqi www.sxt.cn
 *
 */
public interface TypeConvertor {
	
	/**
	 * 将数据库数据类型转化为Java的数据类型
	 * @param columnType 数据库字段的数据类型
	 * @return java数据类型
	 */
	public String databaseType2JavaType(String columnType);
	
	/**
	 * 将Java数据类型转化成数据库数据类型
	 * @param javaDataType java数据类型
	 * @return 数据库数据类型
	 */
	public String javaType2DatabaseType(String javaDataType);
	
}
