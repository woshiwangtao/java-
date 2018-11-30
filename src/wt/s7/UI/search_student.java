package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import wt.s7.BLL.read_file_message_BLL;
import wt.s7.BLL.search_BLL;
import wt.s7.MODEL.student;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class search_student extends JFrame {

	private JPanel contentPane;
	private JTextField number;
	private JTextField name;
	private JTextField seat;
	private JTextField balance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search_student frame = new search_student();
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
	public search_student() {
		setTitle("\u67E5\u8BE2\u5B66\u751F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("\u67E5\u8BE2\u5B66\u751F");
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("\u5B66\u53F7");
		panel_2.add(label_1);
		
		number = new JTextField();
		panel_2.add(number);
		number.setColumns(30);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JLabel label_2 = new JLabel("\u59D3 \u540D");
		panel_3.add(label_2);
		
		name = new JTextField();
		panel_3.add(name);
		name.setColumns(30);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JLabel label_3 = new JLabel("\u5EA7\u4F4D\u53F7");
		panel_4.add(label_3);
		
		seat = new JTextField();
		panel_4.add(seat);
		seat.setColumns(30);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		
		JLabel label_4 = new JLabel("\u4F59 \u989D");
		panel_5.add(label_4);
		
		balance = new JTextField();
		panel_5.add(balance);
		balance.setColumns(30);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton button = new JButton("\u5173\u95ED");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_charge_stu a=new teacher_charge_stu();
				a.main(null);
				hide_frame();
			}
		});
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton button_1 = new JButton("\u67E5\u8BE2");
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*read_file_message_BLL a=new read_file_message_BLL();
				String num=number.getText();
				String b[]=new String[4];
				b=a.Search_file_message(num);
				name.setText(b[1]);
				seat.setText(b[2]);
				balance.setText(b[3]);*/
				student stu=new student();
				stu.number=number.getText();
				search_BLL a = new search_BLL();
				
					stu = a.search(stu);
					stu.name=a.search(stu).name;
					stu.seat=a.search(stu).seat;
					stu.balance=a.search(stu).balance;
					String bal =""+stu.balance;
					name.setText(a.search(stu).name);
					seat.setText(a.search(stu).seat);
					balance.setText(bal);
				
				
				
				
			}
		});
		panel.add(button);
	}
	public void hide_frame() {
		this.setVisible(false);
	}
}
