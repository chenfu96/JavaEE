package com.chenfu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




/**
 * ����ʱ�䴦��java.sql.Date,Time,Timestamp��,ȡ��ָ��ʱ��ε�����
 * @author Administrator
 *
 */
public class Demo08 {
	/**
	 * ���ַ���ת��Ϊlong���֣���ʽ��yyyy-MM-dd hh:mm:ss��
	 * @param dateStr
	 * @return
	 */
	public static long str2Date(String dateStr){
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		 try {
			return format.parse(dateStr).getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//����������
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			ps = conn.prepareStatement("select * from t_user where regtime>? and regtime<?");
			
			java.sql.Date start = new java.sql.Date(str2Date("2017-7-1 1:22:22"));
			java.sql.Date end = new java.sql.Date(str2Date("2017-7-16 10:22:22"));
			
			ps.setObject(1, start);
			ps.setObject(2, end);
			
			rs = ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt("id")+"-->"+rs.getString("username")+"--->"+rs.getDate("regtime"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{//resultSet-->statment-->connection������˳��
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