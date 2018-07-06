package com.bjsxt.sorm.pool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bjsxt.sorm.core.DBManager;

/**
 * 杩炴帴姹犵殑绫�
 * @author gaoqi
 *
 */
public class DBConnPool {
	/**
	 * 杩炴帴姹犲璞�
	 */
	private  List<Connection> pool;  
	
	/**
	 * 鏈�ぇ杩炴帴鏁�
	 */
	private static final int POOL_MAX_SIZE = DBManager.getConf().getPoolMaxSize(); 
	/**
	 * 鏈�皬杩炴帴姹�
	 */
	private static final int POOL_MIN_SIZE = DBManager.getConf().getPoolMinSize();  
	
	
	/**
	 * 鍒濆鍖栬繛鎺ユ睜锛屼娇姹犱腑鐨勮繛鎺ユ暟杈惧埌鏈�皬鍊�
	 */
	public void initPool() {
		if(pool==null){
			pool = new ArrayList<Connection>();
		}
		
		while(pool.size()<DBConnPool.POOL_MIN_SIZE){
			pool.add(DBManager.createConn());
			System.out.println("鍒濆鍖栨睜锛屾睜涓繛鎺ユ暟锛"+pool.size());
		}
	}
	
	
	/**
	 * 浠庤繛鎺ユ睜涓彇鍑轰竴涓繛鎺�
	 * @return
	 */
	public synchronized Connection getConnection() {
		int last_index = pool.size()-1;
		Connection conn = pool.get(last_index);
		pool.remove(last_index);
		
		return conn;
	}
	
	/**
	 * 灏嗚繛鎺ユ斁鍥炴睜涓�
	 * @param conn
	 */
	public synchronized void close(Connection conn){
		
		if(pool.size()>=POOL_MAX_SIZE){
			try {
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			pool.add(conn);
		}
	}
	
	
	public DBConnPool() {
		initPool();
	}
	
}
