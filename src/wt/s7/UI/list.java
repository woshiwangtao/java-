package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import wt.s7.BLL.read_file_message_BLL;
import wt.s7.BLL.search_BLL;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class list extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton button;
	private JButton button_1;
	private JButton button_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list frame = new list();
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
	public list() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5B66\u53F7", "\u59D3\u540D", "\u5EA7\u4F4D\u53F7", "\u4F59\u989D"
			}
		));
		//Object [][]= {"11",null,null.null};
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 0, 0, 0));
		
		panel_2 = new JPanel();
		panel.add(panel_2);
		
		button_2 = new JButton("\u5EA7\u4F4D\u5217\u8868");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*	read_file_message_BLL dd = new read_file_message_BLL();
				Object[][] rowData=dd.read_com_file_message();*/
				search_BLL a =new search_BLL();
				Object[][] rowData = a.select_computer();
				Object[] columnNames= {"座位号","学生学号","学生姓名"};
				table = new JTable(rowData,columnNames);
				scrollPane.setViewportView(table);
				
			}
		});
		panel_2.add(button_2);
		
		panel_3 = new JPanel();
		panel.add(panel_3);
		
		button_1 = new JButton("\u5B66\u751F\u5217\u8868");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*read_file_message_BLL dd = new read_file_message_BLL();
				Object[][] rowData=dd.read_file_message();*/
				search_BLL a =new search_BLL();
				Object[][] rowData = a.select_student();
				Object[] columnNames= {"学号","姓名","座位号","余额"};
				table = new JTable(rowData,columnNames);
				scrollPane.setViewportView(table);
				
			}
				
		});
		panel_3.add(button_1);
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		
		button = new JButton("\u8FD4\u56DE");
		panel_1.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_main_menu a=new teacher_main_menu();
				a.main(null);
				hide_frame();
			}
		});
	}
	public void hide_frame() {
		this.setVisible(false);
	}
}
