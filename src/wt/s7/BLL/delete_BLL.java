package wt.s7.BLL;

import wt.s7.DAL.database_DAL;
import wt.s7.MODEL.computer;
import wt.s7.MODEL.student;

public class delete_BLL {
	
	public void delete(computer com) 
	{
		String sql="update computer set state = 0"+" where seat = '"+com.seat+"'";
		database_DAL a= new database_DAL();
		try {
			a.insert(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delete(student stu) 
	{
		String sql="update student set state = 0"+" where number = '"+stu.number+"'";
		database_DAL a= new database_DAL();
		try {
			a.insert(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
