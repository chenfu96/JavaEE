package com.chenfu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




/**
 * ����Statementִ�нӿڵ��÷���ִ��SQL��䣬�Լ�SQLע������
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stml = null;
		try {
			//����������
			Class.forName("com.mysql.jdbc.Driver");
			//�������ӣ����Ӷ����ڲ���ʵ����һ��Socket������Զ�̵����ӣ��ȽϺ�ʱ������Connection��������һ��Ҫ�㣡��
			//����������Ϊ�����Ч�ʣ�����ʹ�����ӳ����������Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","123456");
			
			
			stml =conn.createStatement();
//			String name = "����";
//			String sql = "insert into t_user (username,pwd,regtime) values ('"+name+"',5555,now())";
//			stml.execute(sql);
			
			//����SQLע��
//			String id = "5 or 1=1";//��������ɾ���������ݣ����˿��������޸�������ݿ�
			String id = 5+"";
			String sql = "delete from t_user where id="+id;
			stml.execute(sql);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(stml!=null){
					stml.close();
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
