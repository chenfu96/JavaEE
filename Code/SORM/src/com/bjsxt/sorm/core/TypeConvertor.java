package com.bjsxt.sorm.core;

/**
 * ����Java�������ͺ����ݿ����ͻ���ת��
 * @author gaoqi www.sxt.cn
 *
 */
public interface TypeConvertor {
	
	/**
	 * �����ݿ���������ת��ΪJava����������
	 * @param columnType ���ݿ��ֶε���������
	 * @return java��������
	 */
	public String databaseType2JavaType(String columnType);
	
	/**
	 * ��Java��������ת�������ݿ���������
	 * @param javaDataType java��������
	 * @return ���ݿ���������
	 */
	public String javaType2DatabaseType(String javaDataType);
	
}
