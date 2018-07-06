package com.chenfu.testjdbc;

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

import com.chenfu.utils.JDBCUtil;






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
			conn = JDBCUtil.getConnection();
			
			ps = conn.prepareStatement("delete from t_user where id>? and id<?");
//			ps.setObject(1, 2);
//			ps.setObject(2, 100);
			
			
			ps.setInt(1, 100);
			ps.setInt(2, 200);
			ps.execute();

			
		} catch (Exception e) {

			e.printStackTrace();
		}finally{
			
			JDBCUtil.close(rs, ps,conn);
		}
	}
}