package com.chenfu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




/**
 * ����PreparedStatement�����÷�
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//����������
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			String sql = "insert into t_user (username,pwd,regtime) values (?,?,?)";//?ռλ��
			ps = conn.prepareStatement(sql);
//			ps.setString(1, "����3");//���������Ǵ�1��ʼ�㣬������0
//			ps.setString(2, "123456");
//			ps.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			
			ps.setObject(1, "����5");
			ps.setObject(2, "12346");
			ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
			
			
			
			System.out.println("����һ�м�¼");
			ps.execute();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps!=null){
					ps.close();
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
