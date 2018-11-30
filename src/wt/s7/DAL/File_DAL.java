package wt.s7.DAL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import wt.s7.MODEL.computer;
import wt.s7.MODEL.student;

public class File_DAL {
	
	//按表格返回学生清单
	  public  String[][] readFileByLinestotable(String fileName) {  
		  String stu[][] = new String[1000][4];
	        File file = new File(fileName);  
	        BufferedReader reader = null;  
	        try { 
	            reader = new BufferedReader(new FileReader(file));  
	            String tempString = null;  
	        
	            // 一次读入一行，直到读入null为文件结束 
	            int i=0;
	            while ((tempString = reader.readLine()) != null) {  
	            	if("true".equals(tempString)) {
	            		stu[i][0]= reader.readLine();
	            		stu[i][1]=reader.readLine();
	            		stu[i][2]=reader.readLine();
	            		stu[i][3]=reader.readLine();
	            		i++;
	            	}
	            	else {
	            		tempString = reader.readLine();
	            		tempString = reader.readLine();
	            		tempString = reader.readLine();
	            		tempString = reader.readLine();
	            	}
	            
	            }  
	            reader.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } finally {  
	            if (reader != null) {  
	                try {  
	                    reader.close();  
	                } catch (IOException e1) {  
	                }  
	            }  
	        }  
	        return stu;
	    }  
	    //按表格返回电脑清单
	  public String[][] read_com_file_to_table(String fileName){
		  String stu[][] = new String[1000][3];
	        File file = new File(fileName);  
	        BufferedReader reader = null;  
	        try { 
	            reader = new BufferedReader(new FileReader(file));  
	            String tempString = null;  
	        
	            // 一次读入一行，直到读入null为文件结束 
	            int i=0;
	            while ((tempString = reader.readLine()) != null) {  
	            	if("true".equals(tempString)) {
	            		stu[i][0]= reader.readLine();
	            		stu[i][1]=reader.readLine();
	            		stu[i][2]=reader.readLine();
	            		i++;
	            	}
	            	else {
	            		tempString = reader.readLine();
	            		tempString = reader.readLine();
	            		tempString = reader.readLine();
	            	}
	            
	            }  
	            reader.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } finally {  
	            if (reader != null) {  
	                try {  
	                    reader.close();  
	                } catch (IOException e1) {  
	                }  
	            }  
	        }  
	        return stu;
	  }
	    //追加文件
	    public void writeToFile(File file,String content) {
	    	//此为覆盖文件
	    	 /* try {

	    	   // if file doesnt exists, then create it
	    	   if (!file.exists()) {
	    	    file.createNewFile();
	    	   }

	    	   FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    	   BufferedWriter bw = new BufferedWriter(fw);
	    	   bw.write(content);
	    	   bw.close();

	    	   System.out.println("Done");

	    	  } catch (IOException e) {
	    	   e.printStackTrace();
	    	  }*/
	    	//此为追加文件
	    	FileWriter writer = null;
	        try {   
	        	 if (!file.exists()) {
	 	    	    file.createNewFile();
	 	    	   }
	            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件   
	            writer = new FileWriter(file, true);   
	            writer.write(content);     
	        } catch (IOException e) {   
	            e.printStackTrace();   
	        } finally {   
	            try {   
	            	if(writer != null){
	            		writer.close();   
	            	}
	            } catch (IOException e) {   
	                e.printStackTrace();   
	            	}   
	        
	        	}
	    	 }

	    
	    //条件查找学生文件
	    public  String[] readFileByLinestoString(String fileName,String num) {  
			  String stu[] = new String[4];
			  stu[0]=num;
		        File file = new File(fileName);  
		        BufferedReader reader = null;  
		        try { 
		            reader = new BufferedReader(new FileReader(file));  
		            String tempString = null;  
		            while ((tempString = reader.readLine()) != null) {  
		      
		                if("true".equals(tempString)) {
		                	tempString = reader.readLine();
		                	if(num.equals(tempString)) {
		                		stu[1]=reader.readLine();
		                		stu[2]=reader.readLine();
		                		stu[3]=reader.readLine();
		                		break;
		                	}
		                }
		            
		            }  
		            reader.close();  
		        } catch (IOException e) {  
		            e.printStackTrace();  
		        } finally {  
		            if (reader != null) {  
		                try {  
		                    reader.close();  
		                } catch (IOException e1) {  
		                }  
		            }  
		        }  
		        return stu;
		    }  
	    
	    // //条件查找电脑文件
	    public  String[] readComputerToStringByOne(String fileName,String seat) {  
			  String stu[] = new String[3];
			  stu[0]=seat;
		        File file = new File(fileName);  
		        BufferedReader reader = null;  
		        try { 
		            reader = new BufferedReader(new FileReader(file));  
		            String tempString = null;
		            while ((tempString = reader.readLine()) != null) {  
		            	System.out.println(tempString);  
		                if("true".equals(tempString)) {
		                	tempString = reader.readLine();
		                	if(seat.equals(tempString)) {
		                		stu[1]=reader.readLine();
		                		stu[2]=reader.readLine();
		                		break;
		                	}
		                }
		            
		            }  
		            reader.close();  
		        } catch (IOException e) {  
		            e.printStackTrace();  
		        } finally {  
		            if (reader != null) {  
		                try {  
		                    reader.close();  
		                } catch (IOException e1) {  
		                }  
		            }  
		        }  
		        return stu;
		    }  
	    //删除学生
	    public void DeleteFromFile(File file,String num,boolean x) {//x为true 硬删除 
	    	if(!x)
	    	try {
	    		
				
				 BufferedReader br = new BufferedReader(new InputStreamReader(
				 new FileInputStream(file)));
				 List list =new ArrayList();
				 //定义一个集合存放每一行的字符串
				 while(true){
					 String str=br.readLine();
					 String num1 = br.readLine();
				 	//读取文件当中的一行
				 	if(num1==null) break;
				 	//如果读取的是空，也就是文件读取结束 跳出循环
				 	int index=num1.indexOf(num);
				 	
				 	//看此行的是否包含num字串
				 	if(num.equals(num1)){
				 		//替换name
				 		list.add("false");
				 		list.add(num1);
				 		str=br.readLine();//name
				 		//str.replace(str, result_name);
				 		list.add(str);
				 		str=br.readLine();//seat
				 		///str.replace(str, result_seat);
				 		list.add(str);
				 		str=br.readLine();//balance
				 		///str.replace(str, result_seat);
				 		list.add(str);
				 	}
				 	else {
				 		list.add(str);
				 		list.add(num1);
				 		str=br.readLine();
				 		list.add(str);
				 		str=br.readLine();
				 		list.add(str);
				 		str=br.readLine();
				 		list.add(str);
				 	}
				 	
				 }
				 br.close();
				 PrintWriter pw=new PrintWriter(file);
				 //建立一个输出流，把东西写入文件
				 for(int i=0;i<list.size();i++){
				 String str =(String)list.get(i);
				 //从集合当中取出字符串
				 pw.println(str);
				 //把该字符串写入文件当中
				 }
				 pw.close();
				 } catch (Exception e) {
				 e.printStackTrace();
				 }
	    }
	    //删除电脑
	    public void DeleteComFromFile(File file,String num,boolean x) {//x为true 硬删除 
	    	//软删除
	    	if(!x) {
		    	try {
					 BufferedReader br = new BufferedReader(new InputStreamReader(
					 new FileInputStream(file)));
					 List list =new ArrayList();
					 //定义一个集合存放每一行的字符串
					 while(true){
						 String str=br.readLine();
						 String seat = br.readLine();
					 	//读取文件当中的一行
					 	if(str==null) break;
					 	//如果读取的是空，也就是文件读取结束 跳出循环
					 
					 	
					 	//看此行的是否包含num字串
					 	if(seat.equals(num)){
					 		//替换name
					 		list.add("false");
					 		list.add(seat);
					 		str=br.readLine();//
					 		list.add(str);
					 		str=br.readLine();//
					 		//str.replace(str, result_name);
					 		list.add(str);
					 	
					 	}
					 	else {
					 		list.add(str);
					 		list.add(seat);
					 		str=br.readLine();
					 		list.add(str);
					 		str=br.readLine();
					 		list.add(str);
					
					 	}
					 	
					 }
					 br.close();
					 PrintWriter pw=new PrintWriter(file);
					 //建立一个输出流，把东西写入文件
					 for(int i=0;i<list.size();i++){
					 String str =(String)list.get(i);
					 //从集合当中取出字符串
					 pw.println(str);
					 //把该字符串写入文件当中
					 }
					 pw.close();
					 } catch (Exception e) {
					 e.printStackTrace();
					 }
	    	}
	    	//硬删除
	    	else {
	    		
	    	}
	    }
	    
	    //修改学生
		    public void ChangeStuFile(File file,student stu) {
		    	try {
					 BufferedReader br = new BufferedReader(new InputStreamReader(
					 new FileInputStream(file)));
					 List list =new ArrayList();
					 //定义一个集合存放每一行的字符串
					 while(true){
						 String str=br.readLine();
						 String number = br.readLine();
					 	//读取文件当中的一行
					 	if(str==null) break;
					 	//如果读取的是空，也就是文件读取结束 跳出循环
					 
					 	
					 	//看此行的是否包含num字串
					 	if(number.equals(stu.number)){
					 		//替换name
					 		list.add(str);
					 		list.add(number);
					 		str=br.readLine();//name
					 		list.add(stu.name);
					 		str=br.readLine();//seat
					 		list.add(stu.seat);
					 		str=br.readLine();//balance
					 		list.add(str);
					 	
					 	}
					 	else {
					 		list.add(str);
					 		list.add(number);
					 		str=br.readLine();
					 		list.add(str);
					 		str=br.readLine();
					 		list.add(str);
					 		str=br.readLine();
					 		list.add(str);
					 	}
					 	
					 }
					 br.close();
					 PrintWriter pw=new PrintWriter(file);
					 //建立一个输出流，把东西写入文件
					 for(int i=0;i<list.size();i++){
					 String str =(String)list.get(i);
					 //从集合当中取出字符串
					 pw.println(str);
					 //把该字符串写入文件当中
					 }
					 pw.close();
					 } catch (Exception e) {
					 e.printStackTrace();
					 }
	    	}
		    //修改电脑
		    public void ChangeComFile(File file,computer com) {
		    	try {
					 BufferedReader br = new BufferedReader(new InputStreamReader(
					 new FileInputStream(file)));
					 List list =new ArrayList();
					 //定义一个集合存放每一行的字符串
					 while(true){
						 String str=br.readLine();
						 String seat = br.readLine();
					 	//读取文件当中的一行
					 	if(str==null) break;
					 	//如果读取的是空，也就是文件读取结束 跳出循环
					 
					 	
					 	//看此行的是否包含num字串
					 	if(seat.equals(com.seat)){
					 		//替换name
					 		list.add(str);
					 		list.add(seat);
					 		str=br.readLine();//user_num
					 		list.add(com.user_number);
					 		str=br.readLine();//user_name
					 		list.add(com.user_name);
					 	
					 	
					 	}
					 	else {
					 		list.add(str);
					 		list.add(seat);
					 		str=br.readLine();
					 		list.add(str);
					 		str=br.readLine();
					 		list.add(str);
					 	
					 	}
					 	
					 }
					 br.close();
					 PrintWriter pw=new PrintWriter(file);
					 //建立一个输出流，把东西写入文件
					 for(int i=0;i<list.size();i++){
					 String str =(String)list.get(i);
					 //从集合当中取出字符串
					 pw.println(str);
					 //把该字符串写入文件当中
					 }
					 pw.close();
					 } catch (Exception e) {
					 e.printStackTrace();
					 }
	    	}
		    
}
