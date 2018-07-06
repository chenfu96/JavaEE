package com.chenfu.xml;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;






/**
 * 测试JDBCUtil工具类来简化JDBC开发
 * @author Administrator
 *
 */
public class TestJDBC {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getMysqlConn();
			
			ps = conn.prepareStatement("insert into t_user (id,username) values(88,?)");
			ps.setString(1, "gaoqi");
			ps.execute();

			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, ps,conn);
		}
	}
}