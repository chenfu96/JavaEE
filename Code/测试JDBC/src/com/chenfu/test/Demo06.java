package com.chenfu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




/**
 * ��������ĸ�����÷�
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		try {
			//����������
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			
			conn.setAutoCommit(false);//JDBCĬ���Զ��ύ
			

			ps1 = conn.prepareStatement("insert into t_use (username,pwd) values(?,?)");
			ps1.setObject(1, "gaoqi");
			ps1.setObject(2, "123456");
			ps1.execute();
			System.out.println("����һ���û�������");
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			ps2 = conn.prepareStatement("insert into t_user (username,pwd) values(?,?)");
			ps2.setObject(1, "��ʿ��");
			ps2.setObject(2, "123456");
			ps2.execute();
			
			System.out.println("�ڶ����û�����ʿ��");
			
			conn.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			try {
				conn.rollback();//�ع�
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{//resultSet-->statment-->connection������˳��
			try {
				
				if(ps1!=null){
					ps1.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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