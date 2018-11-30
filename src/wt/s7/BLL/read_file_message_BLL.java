package wt.s7.BLL;

import java.io.File;

import wt.s7.DAL.File_DAL;

public class read_file_message_BLL {
	//读取学生清单，按表格输出
	public String[][] read_file_message() {
		//最大学生数量1000
		String stu[][]=new String[1000][4];
		File_DAL a = new File_DAL();
	
		stu=a.readFileByLinestotable("list\\student_list.txt");
		int i=0;
		//消除null
		while(stu[i][0]!=null) i++;
		String ss[][]=new String[i+1][4];
		for(int j=0;j<=i;j++) {
			ss[j][0]=stu[j][0];
			ss[j][1]=stu[j][1];
			ss[j][2]=stu[j][2];
			ss[j][3]=stu[j][3];
		}
		return ss;
	}
	//读取电脑清单 按表格输出
	public String[][] read_com_file_message(){
		String com[][]=new String[1000][3];
		File_DAL a = new File_DAL();
		com=a.read_com_file_to_table("list\\computer_list.txt");
		int i=0;
		//消除null
		while(com[i][0]!=null) i++;
		String ss[][]=new String[i+1][3];
		for(int j=0;j<=i;j++) {
			ss[j][0]=com[j][0];
			ss[j][1]=com[j][1];
			ss[j][2]=com[j][2];
		}
		return ss;
	}
	public String[] Search_file_message(String num) {
		String stu[]=new String[4];
		File_DAL a = new File_DAL();
		stu=a.readFileByLinestoString("list\\student_list.txt", num);
		return stu;
	}
	
	public String[] Search_computer_file_message(String seat) {
		String com[] = new String[3];
		File_DAL a = new File_DAL();
		com=a.readComputerToStringByOne("list\\computer_list.txt", seat);
		return com;
	}
}
