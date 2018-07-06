package com.chenfu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




/**
 * 测试ResultSet基本用法
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			String sql = "select id,username,pwd from t_user where id>?";//?占位符
			ps = conn.prepareStatement(sql);
			ps.setObject(1, 2);//id大于2 的记录取出来
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getInt(1)+"--->"+rs.getString(2)+"--->"+rs.getString(3));
			}
			
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