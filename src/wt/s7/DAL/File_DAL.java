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
	
	//����񷵻�ѧ���嵥
	  public  String[][] readFileByLinestotable(String fileName) {  
		  String stu[][] = new String[1000][4];
	        File file = new File(fileName);  
	        BufferedReader reader = null;  
	        try { 
	            reader = new BufferedReader(new FileReader(file));  
	            String tempString = null;  
	        
	            // һ�ζ���һ�У�ֱ������nullΪ�ļ����� 
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
	    //����񷵻ص����嵥
	  public String[][] read_com_file_to_table(String fileName){
		  String stu[][] = new String[1000][3];
	        File file = new File(fileName);  
	        BufferedReader reader = null;  
	        try { 
	            reader = new BufferedReader(new FileReader(file));  
	            String tempString = null;  
	        
	            // һ�ζ���һ�У�ֱ������nullΪ�ļ����� 
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
	    //׷���ļ�
	    public void writeToFile(File file,String content) {
	    	//��Ϊ�����ļ�
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
	    	//��Ϊ׷���ļ�
	    	FileWriter writer = null;
	        try {   
	        	 if (!file.exists()) {
	 	    	    file.createNewFile();
	 	    	   }
	            // ��һ��д�ļ��������캯���еĵڶ�������true��ʾ��׷����ʽд�ļ�   
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

	    
	    //��������ѧ���ļ�
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
	    
	    // //�������ҵ����ļ�
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
	    //ɾ��ѧ��
	    public void DeleteFromFile(File file,String num,boolean x) {//xΪtrue Ӳɾ�� 
	    	if(!x)
	    	try {
	    		
				
				 BufferedReader br = new BufferedReader(new InputStreamReader(
				 new FileInputStream(file)));
				 List list =new ArrayList();
				 //����һ�����ϴ��ÿһ�е��ַ���
				 while(true){
					 String str=br.readLine();
					 String num1 = br.readLine();
				 	//��ȡ�ļ����е�һ��
				 	if(num1==null) break;
				 	//�����ȡ���ǿգ�Ҳ�����ļ���ȡ���� ����ѭ��
				 	int index=num1.indexOf(num);
				 	
				 	//�����е��Ƿ����num�ִ�
				 	if(num.equals(num1)){
				 		//�滻name
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
				 //����һ����������Ѷ���д���ļ�
				 for(int i=0;i<list.size();i++){
				 String str =(String)list.get(i);
				 //�Ӽ��ϵ���ȡ���ַ���
				 pw.println(str);
				 //�Ѹ��ַ���д���ļ�����
				 }
				 pw.close();
				 } catch (Exception e) {
				 e.printStackTrace();
				 }
	    }
	    //ɾ������
	    public void DeleteComFromFile(File file,String num,boolean x) {//xΪtrue Ӳɾ�� 
	    	//��ɾ��
	    	if(!x) {
		    	try {
					 BufferedReader br = new BufferedReader(new InputStreamReader(
					 new FileInputStream(file)));
					 List list =new ArrayList();
					 //����һ�����ϴ��ÿһ�е��ַ���
					 while(true){
						 String str=br.readLine();
						 String seat = br.readLine();
					 	//��ȡ�ļ����е�һ��
					 	if(str==null) break;
					 	//�����ȡ���ǿգ�Ҳ�����ļ���ȡ���� ����ѭ��
					 
					 	
					 	//�����е��Ƿ����num�ִ�
					 	if(seat.equals(num)){
					 		//�滻name
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
					 //����һ����������Ѷ���д���ļ�
					 for(int i=0;i<list.size();i++){
					 String str =(String)list.get(i);
					 //�Ӽ��ϵ���ȡ���ַ���
					 pw.println(str);
					 //�Ѹ��ַ���д���ļ�����
					 }
					 pw.close();
					 } catch (Exception e) {
					 e.printStackTrace();
					 }
	    	}
	    	//Ӳɾ��
	    	else {
	    		
	    	}
	    }
	    
	    //�޸�ѧ��
		    public void ChangeStuFile(File file,student stu) {
		    	try {
					 BufferedReader br = new BufferedReader(new InputStreamReader(
					 new FileInputStream(file)));
					 List list =new ArrayList();
					 //����һ�����ϴ��ÿһ�е��ַ���
					 while(true){
						 String str=br.readLine();
						 String number = br.readLine();
					 	//��ȡ�ļ����е�һ��
					 	if(str==null) break;
					 	//�����ȡ���ǿգ�Ҳ�����ļ���ȡ���� ����ѭ��
					 
					 	
					 	//�����е��Ƿ����num�ִ�
					 	if(number.equals(stu.number)){
					 		//�滻name
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
					 //����һ����������Ѷ���д���ļ�
					 for(int i=0;i<list.size();i++){
					 String str =(String)list.get(i);
					 //�Ӽ��ϵ���ȡ���ַ���
					 pw.println(str);
					 //�Ѹ��ַ���д���ļ�����
					 }
					 pw.close();
					 } catch (Exception e) {
					 e.printStackTrace();
					 }
	    	}
		    //�޸ĵ���
		    public void ChangeComFile(File file,computer com) {
		    	try {
					 BufferedReader br = new BufferedReader(new InputStreamReader(
					 new FileInputStream(file)));
					 List list =new ArrayList();
					 //����һ�����ϴ��ÿһ�е��ַ���
					 while(true){
						 String str=br.readLine();
						 String seat = br.readLine();
					 	//��ȡ�ļ����е�һ��
					 	if(str==null) break;
					 	//�����ȡ���ǿգ�Ҳ�����ļ���ȡ���� ����ѭ��
					 
					 	
					 	//�����е��Ƿ����num�ִ�
					 	if(seat.equals(com.seat)){
					 		//�滻name
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
					 //����һ����������Ѷ���д���ļ�
					 for(int i=0;i<list.size();i++){
					 String str =(String)list.get(i);
					 //�Ӽ��ϵ���ȡ���ַ���
					 pw.println(str);
					 //�Ѹ��ַ���д���ļ�����
					 }
					 pw.close();
					 } catch (Exception e) {
					 e.printStackTrace();
					 }
	    	}
		    
}
