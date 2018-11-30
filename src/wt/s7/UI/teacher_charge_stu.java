package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class teacher_charge_stu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacher_charge_stu frame = new teacher_charge_stu();
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
	public teacher_charge_stu() {
		setTitle("\u5B66\u751F\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 0, 0));
		
		Panel panel_1 = new Panel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button = new JButton("1.\u6DFB\u52A0\u5B66\u751F");
		button.setBackground(new Color(240, 240, 240));
		button.setFont(new Font("宋体", Font.PLAIN, 34));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_students a=new add_students();
				a.main(null);
				hide_frame();
			}
		});
		panel_1.add(button);
		
		Panel panel = new Panel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_1 = new JButton("2.\u5220\u9664\u5B66\u751F");
		button_1.setBackground(new Color(240, 240, 240));
		button_1.setFont(new Font("宋体", Font.PLAIN, 34));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete_student b =new delete_student();
				b.main(null);
				hide_frame();
			}
		});
		panel.add(button_1);
		
		Panel panel_2 = new Panel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_2 = new JButton("3.\u4FEE\u6539\u5B66\u751F");
		button_2.setFont(new Font("宋体", Font.PLAIN, 34));
		button_2.setBackground(new Color(240, 240, 240));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change_student c = new change_student();
				c.main(null);
				hide_frame();
			}
		});
		panel_2.add(button_2);
		
		Panel panel_3 = new Panel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("4.\u67E5\u8BE2\u5B66\u751F");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 34));
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search_student d = new search_student();
				d.main(null);
				hide_frame();
			}
		});
		panel_3.add(btnNewButton);
		
		Panel panel_4 = new Panel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_3 = new JButton("5.\u8FD4\u56DE");
		button_3.setFont(new Font("宋体", Font.PLAIN, 34));
		button_3.setBackground(new Color(240, 240, 240));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_main_menu f = new teacher_main_menu();
				f.main(null);
				hide_frame();
			}
		});
		panel_4.add(button_3);
	}
	public void hide_frame() {
		this.setVisible(false);
	}
}
