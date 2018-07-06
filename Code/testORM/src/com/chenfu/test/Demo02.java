package com.chenfu.test;

import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.PresentationDirection;

/**
 * 测试使用Map来封装一条记录
 * 使用List<Map>存储多条记录
 * @author Administrator
 *
 */


public class Demo02 {

	
	public static void test01(){
		Connection conn = JDBCUtil.getMysqlConn();
		PreparedStatement ps  = null;
		ResultSet rs = null;
		Map<String,Object> row = new HashMap<String, Object>();
		try {
			ps = conn.prepareStatement("select empname,salary,age from emp where id=?");
			ps.setInt(1, 1);
			rs = ps.executeQuery();
			while(rs.next()){
				row.put("empname", rs.getObject(1));
				row.put("salary", rs.getObject(2));
				row.put("age", rs.getObject(3));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, ps, conn);
			for(String key : row.keySet()){
				System.out.println(key+"-->"+row.get(key));
			}
		}
	}

	
	public static void test02(){
		Connection conn = JDBCUtil.getMysqlConn();
		PreparedStatement ps  = null;
		ResultSet rs = null;
		List<Map<String,Object> > list = new ArrayList<Map<String,Object>>();
		try {
			ps = conn.prepareStatement("select empname,salary,age from emp where id>?");
			ps.setInt(1, 1);
			rs = ps.executeQuery();
			while(rs.next()){
				Map<String,Object> row = new HashMap<String, Object>();
				row.put("empname", rs.getObject(1));
				row.put("salary", rs.getObject(2));
				row.put("age", rs.getObject(3));
				list.add(row);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, ps, conn);
			for(Map<String,Object> row : list){
				for(String key : row.keySet()){
					System.out.println(key+"-->"+row.get(key));
				}
			}
		}
	}
	
	public static void main(String[] args) {
	
		test02();
	}
	
	
	
}
