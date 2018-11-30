package wt.s7.BLL;

import java.io.File;

import wt.s7.DAL.File_DAL;
import wt.s7.MODEL.computer;
import wt.s7.MODEL.student;

public class change_file_message_BLL {
	public void change_studdent(student stu) {
		File file = new File("list\\student_list.txt");
		File_DAL a = new File_DAL();
		a.ChangeStuFile(file, stu);
		computer com = new computer();
		com.seat=stu.seat;com.user_name=stu.name;com.user_number=stu.number;
		change_computer1(com);
	}
	public void change_computer(computer com) {
		File file = new File("list\\computer_list.txt");
		File_DAL a = new File_DAL();
		a.ChangeComFile(file, com);
		student stu = new student();
		stu.name=com.user_name;stu.number=com.user_number;stu.seat=com.seat;
		change_studdent1(stu);
	}
	public void change_studdent1(student stu) {
		File file = new File("list\\student_list.txt");
		File_DAL a = new File_DAL();
		a.ChangeStuFile(file, stu);
		
	}
	public void change_computer1(computer com) {
		File file = new File("list\\computer_list.txt");
		File_DAL a = new File_DAL();
		a.ChangeComFile(file, com);
		
	}
}
