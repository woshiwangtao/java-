package wt.s7.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class teacher_charge_com extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacher_charge_com frame = new teacher_charge_com();
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
	public teacher_charge_com() {
		setTitle("\u8BA1\u7B97\u673A\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 0, 0));
		
		Panel panel_1 = new Panel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button = new JButton("1.\u65B0\u589E\u8BA1\u7B97\u673A");
		button.setFont(new Font("宋体", Font.PLAIN, 34));
		button.setBackground(new Color(240, 240, 240));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_computer a=new add_computer();
				a.main(null);
				hide_frame();
			}
		});
		panel_1.add(button);
		
		Panel panel = new Panel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_1 = new JButton("2.\u67E5\u8BE2\u8BA1\u7B97\u673A");
		button_1.setBackground(new Color(240, 240, 240));
		button_1.setFont(new Font("宋体", Font.PLAIN, 34));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search_computer b =new search_computer();
				b.main(null);
				hide_frame();
			}
		});
		panel.add(button_1);
		
		Panel panel_3 = new Panel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_2 = new JButton("3.\u4FEE\u6539\u8BA1\u7B97\u673A\u4FE1\u606F");
		button_2.setBackground(new Color(240, 240, 240));
		button_2.setFont(new Font("宋体", Font.PLAIN, 34));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change_computer c =new change_computer();
				c.main(null);
				hide_frame();
			}
		});
		panel_3.add(button_2);
		
		Panel panel_2 = new Panel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_3 = new JButton("4.\u5220\u9664\u8BA1\u7B97\u673A");
		button_3.setBackground(new Color(240, 240, 240));
		button_3.setFont(new Font("宋体", Font.PLAIN, 34));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete_computer d=new delete_computer();
				d.main(null);
				hide_frame();
			}
		});
		panel_2.add(button_3);
		
		Panel panel_4 = new Panel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_4 = new JButton("5.\u8FD4\u56DE");
		button_4.setBackground(new Color(240, 240, 240));
		button_4.setFont(new Font("宋体", Font.PLAIN, 34));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacher_main_menu f =new teacher_main_menu();
				f.main(null);
				hide_frame();
			}
		});
		panel_4.add(button_4);
	}
	public void hide_frame() {
		this.setVisible(false);
	}
}
