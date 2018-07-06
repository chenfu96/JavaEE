package com.chenfu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




/**
 * 测试PreparedStatement基本用法
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			String sql = "insert into t_user (username,pwd,regtime) values (?,?,?)";//?占位符
			ps = conn.prepareStatement(sql);
//			ps.setString(1, "高旗3");//参数索引是从1开始算，而不是0
//			ps.setString(2, "123456");
//			ps.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			
			ps.setObject(1, "高旗5");
			ps.setObject(2, "12346");
			ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
			
			
			
			System.out.println("插入一行记录");
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
