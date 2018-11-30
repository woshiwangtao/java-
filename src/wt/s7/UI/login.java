package wt.s7.UI;

import java.awt.BorderLayout;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import wt.s7.BLL.login_BLL;
import wt.s7.UI.teacher_main_menu;

import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void ToLogin(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
	}
	
	
	

	/**
	 * Create the frame.
	 */
	public login() {
		setTitle("\u6B22\u8FCE\u4F7F\u7528\u673A\u623F\u7BA1\u7406\u7CFB\u7EDF");
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(204, 204, 153));
		contentPane.add(panel_2);
		
		JLabel label_5 = new JLabel("\u767B\u5F55");
		panel_2.add(label_5);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(204, 204, 153));
		contentPane.add(panel);
		
		JLabel label = new JLabel("\u8D26\u53F7");
		panel.add(label);
		
		id = new JTextField();
		panel.add(id);
		id.setBackground(Color.WHITE);
		id.setColumns(20);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(204, 204, 153));
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		panel_1.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(20);
		panel_1.add(passwordField);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(204, 204, 153));
		contentPane.add(panel_3);
		
		Button login = new Button("\u767B\u9646");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id1,password1;
				id1=id.getText();password1=passwordField.getText();
				login_select(id1,password1);
				
				
			}
		});
		panel_3.add(login);
		login.setActionCommand("");
		
		Button exit = new Button("\u9000\u51FA");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		panel_3.add(exit);
	}
	//µÇÂ½ÅÐ¶Ï
	public void login_select(String id,String password) {
		login_BLL a = new login_BLL();
		String[] pas=a.login(id);
		if(id.equals(id)&&password.equals(pas[0])) {
			 JOptionPane.showMessageDialog(null,"µÇÂ½³É¹¦");
			 this.dispose();
			 if(pas[1].equals("0")) {
			 teacher_main_menu tea = new teacher_main_menu();
			 tea.main(null);}
			 else {
				 //Ñ§Éú¶Ë
			 }
			
			 
		}
		else {
			 JOptionPane.showMessageDialog(null,"ÕËºÅ»òÃÜÂë´íÎó");
		}
	}

}
