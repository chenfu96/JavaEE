package com.bjsxt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 娴嬭瘯鎵瑰鐞嗙殑鍩烘湰鐢ㄦ硶
 * @author 楂樻穱 www.sxt.cn
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//鍔犺浇椹卞姩绫�
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			conn.setAutoCommit(false);  //璁句负鎵嬪姩鎻愪氦
			long start = System.currentTimeMillis();
			stmt = conn.createStatement();
			
			for(int i=0;i<20000;i++){
				stmt.addBatch("insert into t_user (username,pwd,regTime) values ('gao"+i+"',666666,now())");
			}
			stmt.executeBatch();
			conn.commit();  //鎻愪氦浜嬪姟
			long end = System.currentTimeMillis();
			System.out.println("处理20000条数据" +(end-start));
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//閬靛惊锛歳esultset-->statment-->connection杩欐牱鐨勫叧闂『搴忥紒涓�畾瑕佸皢涓変釜trycatch鍧楋紝鍒嗗紑鍐欙紒
			try {
				if(rs!=null){
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(stmt!=null){
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
