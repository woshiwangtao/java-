package wt.s7.DAL;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import wt.s7.MODEL.student;

public class database_DAL {
	public void insert(String sql) throws Exception//�������е�table
	{	login_database a = new login_database();
		Connection conn = a.login_database();
		Statement start = conn.createStatement();
		int count=start.executeUpdate(sql);
	}
	
	public ResultSet select(String sql) throws Exception //��ѯ��
	{
		login_database a = new login_database();
		Connection conn;
		conn = a.login_database();
		Statement start = conn.createStatement();
		ResultSet rs = start.executeQuery(sql);
		return rs;
	}
	
}
