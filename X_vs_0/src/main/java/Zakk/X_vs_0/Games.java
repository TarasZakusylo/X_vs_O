package Zakk.X_vs_0;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Games extends JFrame{

	private static final long serialVersionUID = 1L;

	public Games(String s, int i_Regum) {
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_Nazva = new JLabel("Літературні  хрестики  нулики");
		l_Nazva.setFont(new Font("Times New Roman", Font.PLAIN, 39));
		l_Nazva.setHorizontalAlignment(SwingConstants.CENTER);
		l_Nazva.setBounds(12, 13, 570, 85);
		getContentPane().add(l_Nazva);
		
		JLabel label = new JLabel("4");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setFont(new Font("Segoe Script", Font.BOLD, 30));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(81, 286, 103, 85);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("5");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Segoe Script", Font.BOLD, 30));
		label_1.setBounds(228, 286, 103, 85);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("6");
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("Segoe Script", Font.BOLD, 30));
		label_2.setBounds(387, 286, 103, 85);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("3");
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("Segoe Script", Font.BOLD, 30));
		label_3.setBounds(367, 174, 103, 85);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("2");
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Segoe Script", Font.BOLD, 30));
		label_4.setBounds(213, 174, 103, 85);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("1");
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Segoe Script", Font.BOLD, 30));
		label_5.setBounds(65, 174, 103, 85);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("7");
		label_6.setVerticalAlignment(SwingConstants.TOP);
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Segoe Script", Font.BOLD, 30));
		label_6.setBounds(65, 399, 103, 85);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("8");
		label_7.setVerticalAlignment(SwingConstants.TOP);
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("Segoe Script", Font.BOLD, 30));
		label_7.setBounds(228, 399, 103, 85);
		getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("9");
		label_8.setVerticalAlignment(SwingConstants.TOP);
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("Segoe Script", Font.BOLD, 30));
		label_8.setBounds(387, 399, 103, 85);
		getContentPane().add(label_8);
		
				JLabel l_fon = new JLabel("");
				l_fon.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\Pole.png"));
				l_fon.setBounds(0, 0, 594, 565);
				getContentPane().add(l_fon);

		setVisible(true);
		
	}

}
