package com.chenfu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import com.chenfu.config.ReadConfig;

public class JDBCUtil {

	public static Connection getConnection(){
		try{
			
			Class.forName(ReadConfig.getIntance().getDRIVERMANAGER());
			return DriverManager.getConnection(ReadConfig.getIntance().getURL(),
					ReadConfig.getIntance().getUSERNAME(),ReadConfig.getIntance().getPASSWORD());
		}catch(Exception e){
			throw  new RuntimeException("创建连接失败");
		}
		 
	}
	
	
	
	public static void close(ResultSet rs, PreparedStatement ps,Connection conn){
		try {
			if(rs != null){
				rs.close();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
	
	
	
	public static void close(Statement ps,Connection conn){
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
	
	
	public static void close(Connection conn){
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
