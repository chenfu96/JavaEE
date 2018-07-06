package com.chenfu.test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;





/**
 * 测试CLOB 文本大对象的使用
 * 包含：将字符串、文件内容插入数据库中CLOB字段、将CLOB字段取出来
 * @author Administrator
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Reader r =null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			ps = conn.prepareStatement("insert into t_user (username,myInfo) values (?,?)");
			ps.setString(1, "高旗");
			
//			ps.setClob(2, new FileReader(new File("d:/a.txt")));//将文本文件内容直接输入到数据库中
			//将程序中的字符串输入到数据库CLOB的字段中
//			ps.setClob(2, new BufferedReader(new InputStreamReader(new ByteArrayInputStream("aaaaa".getBytes()))));
			
			
			ps = conn.prepareStatement("select * from t_user where id=?");
			ps.setObject(1, 4);
			
			rs = ps.executeQuery();
			while(rs.next()){
				Clob c = rs.getClob("myInfo");
				r = c.getCharacterStream();
				int temp = 0 ;
				while((temp=r.read())!=-1){
					System.out.println((char)temp);
				}
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{//resultSet-->statment-->connection这样的顺序
			
			try {
				if(r!=null){
					r.close();
				}
			} catch (IOException e1) {
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
	}
}