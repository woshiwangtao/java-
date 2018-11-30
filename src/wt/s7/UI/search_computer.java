package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import wt.s7.BLL.read_file_message_BLL;
import wt.s7.BLL.search_BLL;
import wt.s7.MODEL.computer;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class search_computer extends JFrame {

	private JPanel contentPane;
	private JTextField seat;
	private JTextField user_name;
	private JTextField user_num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search_computer frame = new search_computer();
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
	public search_computer() {
		setTitle("\u67E5\u8BE2\u8BA1\u7B97\u673A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("\u67E5\u8BE2\u8BA1\u7B97\u673A");
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("\u8BA1\u7B97\u673A\u5EA7\u4F4D\u53F7");
		panel_2.add(label_1);
		
		seat = new JTextField();
		panel_2.add(seat);
		seat.setColumns(20);
		
		JButton button_1 = new JButton("\u67E5\u8BE2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*read_file_message_BLL a = new read_file_message_BLL();
				String num=seat.getText();
				String com[]= new String[3];
				com=a.Search_computer_file_message(num);
				user_name.setText(com[2]);
				user_num.setText(com[1]);*/
				computer com = new computer();
				com.seat=seat.getText();
				search_BLL a = new search_BLL();
				com=a.search(com);
				user_name.setText(com.user_name);
				user_num.setText(com.user_number);
			}
		});
		panel_2.add(button_1);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JLabel label_2 = new JLabel("\u5B66\u751F\u59D3\u540D");
		panel_3.add(label_2);
		
		user_name = new JTextField();
		panel_3.add(user_name);
		user_name.setColumns(30);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JLabel label_3 = new JLabel("\u5B66\u751F\u5B66\u53F7");
		panel_4.add(label_3);
		
		user_num = new JTextField();
		panel_4.add(user_num);
		user_num.setColumns(30);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton button = new JButton("\u5173\u95ED");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_charge_com a=new teacher_charge_com();
				a.main(null);
				hide_frame();
			}
		});
		panel.add(button);
	}
	public void hide_frame() {
		this.setVisible(false);
	}
}
