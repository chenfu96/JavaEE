package com.chenfu.xml;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class JDBCUtil {
	
	public static Connection getMysqlConn(){
		
		Map<String, String> config = ReadXML.getXML();
		
		try {
			Class.forName(config.get("mysqlDriver"));
			return DriverManager.getConnection(config.get("mysqlURL"),
					config.get("mysqlUser"),config.get("mysqlPSW"));
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
