package com.chenfu.test;

import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.attribute.standard.PresentationDirection;

/**
 * 测试使用Object[]来封装一条记录
 * @author Administrator
 *
 */


public class Demo01 {

	public static void main(String[] args) {
		Connection conn = JDBCUtil.getMysqlConn();
		PreparedStatement ps  = null;
		ResultSet rs = null;
		Object[] obj = null;
		try {
			ps = conn.prepareStatement("select empname,salary,age from emp where id=?");
			ps.setInt(1, 1);
			rs = ps.executeQuery();
			obj = new Object[3];//一个Object数组来封装一条记录信息
			while(rs.next()){
//				System.out.println(rs.getString(1)+"--->"+rs.getDouble(2));
				obj[0] = rs.getObject(1);
				obj[1] = rs.getObject(2);
				obj[2] = rs.getObject(3);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, ps, conn);
			System.out.println(""+obj[0]+obj[1]);
		}
	}
	
	
	
}
