package com.chenfu.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JDBCUtil {

	static Properties pros = null; //可以帮助读取和处理资源文件中的信息 
	
	static{//加载JDKUtil类时调用
		pros = new  Properties();
		try {
			pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static Connection getMysqlConn(){
		try {
			Class.forName(pros.getProperty("mysqlDriver"));
			return DriverManager.getConnection(pros.getProperty("mysqlURL"),
					pros.getProperty("mysqlUser"),pros.getProperty("mysqlPSW"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static Connection getOracleConn(){
		try {
			Class.forName(pros.getProperty("oracleDriver"));
			return DriverManager.getConnection(pros.getProperty("oracleURL"),pros.getProperty("oracleUser"),pros.getProperty("oraclePwd "));
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void close(ResultSet rs, PreparedStatement ps,Connection conn){
		try {
			if(rs != null){
				rs.close();
			}
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		try {
			
			if(ps!=null){
				ps.close();
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
