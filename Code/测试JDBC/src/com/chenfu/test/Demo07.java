package com.chenfu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Random;




/**
 * 测试时间处理（java.sql.Date,Time,Timestamp）
 * @author Administrator
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps1 = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			
			
			for(int i =0 ; i < 1000; i++){
				ps1 = conn.prepareStatement("insert into t_user (username,pwd,regtime,lastLogin) values(?,?,?,?)");
				ps1.setObject(1, "高旗");
				ps1.setObject(2, "123456");
				
				int rand = 10000000+new Random().nextInt(100000000);
				
				java.sql.Date data = new java.sql.Date(System.currentTimeMillis()-rand);
				Timestamp stamp = new Timestamp(System.currentTimeMillis()-rand);
				ps1.setObject(3, data);
				ps1.setTimestamp(4,stamp);
				
				
				ps1.execute();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{//resultSet-->statment-->connection这样的顺序
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