package com.chenfu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * ���Ը����ݿ⽨������
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		Connection conn= null;
		try {
			//����������
			Class.forName("com.mysql.jdbc.Driver");
			//�������ӣ����Ӷ����ڲ���ʵ����һ��Socket������Զ�̵����ӣ��ȽϺ�ʱ������Connection��������һ��Ҫ�㣡��
			//����������Ϊ�����Ч�ʣ�����ʹ�����ӳ����������Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","123456");
			System.out.println(conn);
			
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
