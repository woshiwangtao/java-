package wt.s7.BLL;

import java.io.File;

import wt.s7.DAL.File_DAL;
import wt.s7.MODEL.computer;
import wt.s7.MODEL.student;

public class add_file_message_BLL {
	public void add_file_message(student stu) {
		File file = new File("list\\student_list.txt");
		String content = stu.state+"\r\n"+stu.number+"\r\n"+stu.name+"\r\n"+stu.seat+"\r\n"+stu.balance+"\r\n"; 
		File_DAL a = new File_DAL();
		a.writeToFile(file, content);
		computer com=new computer();
		com.seat=stu.seat;com.user_name=stu.name;com.user_number=stu.number;
		change_file_message_BLL b = new change_file_message_BLL();
		b.change_computer1(com);
	}
	
	
	public void add_file_message1(computer com) {
		File file = new File("list\\computer_list.txt");
		String content = com.state+"\r\n"+com.seat+"\r\n"+com.user_number+"\r\n"+com.user_name+"\r\n"; 
		File_DAL a = new File_DAL();
		a.writeToFile(file, content);
	}
	
}
