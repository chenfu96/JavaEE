package com.chenfu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




/**
 * 测试批量处理的基本用法
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			conn.setAutoCommit(false);//设为手动提交！
			
			long start = System.currentTimeMillis();
			stmt = conn.createStatement();
			
			for(int i = 0; i < 2900; i ++){
				stmt.addBatch("insert into t_user (username,psw,regtime) values('gao"+i+"','666666',now())");
			}
			
			stmt.executeBatch();
			
			conn.commit();
			long end = System.currentTimeMillis();
			System.out.println("插入29000数据耗时"+(end-start));
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{//resultSet-->statment-->connection这样的顺序
			try {
				try {
					if(rs!=null){
						rs.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(stmt!=null){
					stmt.close();
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