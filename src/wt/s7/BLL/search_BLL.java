package wt.s7.BLL;

import java.sql.ResultSet;
import wt.s7.DAL.database_DAL;
import wt.s7.MODEL.computer;
import wt.s7.MODEL.student;

public class search_BLL {

	public student search(student stu)
	{
		String sql="SELECT * FROM student where number =  '"+stu.number+"'";
		database_DAL a= new database_DAL();
		student stuu= new student();
		
		try {
			ResultSet rs =a.select(sql);
			while(rs.next())
			{
				stu.state=rs.getBoolean("state");
				if(stu.state) {
				stu.number=rs.getString("number");
				stu.name=rs.getString("name");
				
				stu.seat = rs.getString("seat");
				stu.balance = rs.getInt("balance");
				} 
				else {
						stu.number="无";
						stu.name="无";
						stu.seat = "无";
						stu.balance = 0;
					}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stu;	
		
	}
	
	public computer search(computer com)
	{
		String sql="SELECT * FROM computer where seat =  '"+com.seat+"'";
		database_DAL a= new database_DAL();
		try {
			ResultSet rs =a.select(sql);
			while(rs.next())
			{
				com.state=rs.getBoolean("state");
				if(com.state) {
				com.user_name=rs.getString("user_name");
				com.user_number=rs.getString("user_number");
				}
				else
				{
					com.user_name="无";
					com.user_number="无";
				}
			} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return com;	
		
	}
	
	
	//输出student_list
	public String[][] select_student(){
		String sql="SELECT * FROM student ";
		database_DAL a= new database_DAL();
		String stuu[][]=new String[1000][4];
		student stu = new student();
		int i=0;
		try {
			ResultSet rs =a.select(sql);
			while(rs.next())
			{
				stu.state=rs.getBoolean("state");
				if(stu.state) {
				stu.number=rs.getString("number");
				stuu[i][0]=stu.number;
				stu.name=rs.getString("name");
				stuu[i][1]=stu.name;
				stu.seat = rs.getString("seat");
				stuu[i][2]=stu.seat;
				stu.balance = rs.getInt("balance");
				stuu[i][3]=""+stu.balance;
				i++;
				} 
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//消除null
		i=0;
		while(stuu[i][0]!=null) i++;
		String ss[][]=new String[i+1][4];
		for(int j=0;j<=i;j++) {
			ss[j][0]=stuu[j][0];
			ss[j][1]=stuu[j][1];
			ss[j][2]=stuu[j][2];
			ss[j][3]=stuu[j][3];
		}
		return ss;
	}
	
	//输出computer_list
	public String[][] select_computer(){
		String sql="SELECT * FROM computer ";
		database_DAL a= new database_DAL();
		String stuu[][]=new String[1000][3];
		computer stu = new computer();
		int i=0;
		try {
			ResultSet rs =a.select(sql);
			while(rs.next())
			{
				stu.state=rs.getBoolean("state");
				if(stu.state) {
				stu.seat=rs.getString("seat");
				stuu[i][0]=stu.seat;
				stu.user_number=rs.getString("user_number");
				stuu[i][1]=stu.user_number;
				stu.user_name = rs.getString("user_name");
				stuu[i][2]=stu.user_name;
				i++;
				} 
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//消除null
		i=0;
		while(stuu[i][0]!=null) i++;
		String ss[][]=new String[i+1][3];
		for(int j=0;j<=i;j++) {
			ss[j][0]=stuu[j][0];
			ss[j][1]=stuu[j][1];
			ss[j][2]=stuu[j][2];
		}
		return ss;
	}
}
