package Zakk.X_vs_0;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Games extends JFrame {

	private static final long serialVersionUID = 1L;

	static JLabel l_1 = new JLabel("1");
	static JLabel l_2 = new JLabel("2");
	static JLabel l_3 = new JLabel("3");
	static JLabel l_4 = new JLabel("4");
	static JLabel l_5 = new JLabel("5");
	static JLabel l_6 = new JLabel("6");
	static JLabel l_7 = new JLabel("7");
	static JLabel l_8 = new JLabel("8");
	static JLabel l_9 = new JLabel("9");

	public Games(String s, int i_Regum, final int i_pozucia1, final int i_pozucia2, final int i_pozucia3,
			final int i_pozucia4, final int i_pozucia5, final int i_pozucia6, final int i_pozucia7,
			final int i_pozucia8, final int i_pozucia9) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_Nazva = new JLabel("Мовні  хрестики  нулики");
		l_Nazva.setFont(new Font("Times New Roman", Font.PLAIN, 39));
		l_Nazva.setHorizontalAlignment(SwingConstants.CENTER);
		l_Nazva.setBounds(12, 13, 570, 85);
		getContentPane().add(l_Nazva);

		if (i_pozucia1 == 0) {
			l_1 = new JLabel("1");
			l_1.setVerticalAlignment(SwingConstants.TOP);
			l_1.setHorizontalAlignment(SwingConstants.RIGHT);
			l_1.setFont(new Font("Segoe Script", Font.BOLD, 30));
			l_1.setForeground(Color.BLACK);

			l_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Zaputanna("Запитання", 1, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
							i_pozucia6, i_pozucia7, i_pozucia8, i_pozucia9);
					setVisible(false);
				}
			});

		} else {
			if (i_pozucia1 == 1) {
				l_1 = new JLabel("Х");
			} else {
				l_1 = new JLabel("0");
			}
			l_1.setVerticalAlignment(SwingConstants.CENTER);
			l_1.setHorizontalAlignment(SwingConstants.CENTER);
			l_1.setFont(new Font("Segoe Script", Font.BOLD, 75));
			l_1.setForeground(Color.RED);
		}
		l_1.setBounds(65, 174, 103, 85);
		getContentPane().add(l_1);

		if (i_pozucia2 == 0) {
			l_2 = new JLabel("2");
			l_2.setVerticalAlignment(SwingConstants.TOP);
			l_2.setHorizontalAlignment(SwingConstants.RIGHT);
			l_2.setFont(new Font("Segoe Script", Font.BOLD, 30));
			l_2.setForeground(Color.BLACK);

			l_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Zaputanna("Запитання", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
							i_pozucia6, i_pozucia7, i_pozucia8, i_pozucia9);
					setVisible(false);
				}
			});

		} else {
			if (i_pozucia2 == 1) {
				l_2 = new JLabel("Х");
			} else {
				l_2 = new JLabel("0");
			}
			l_2.setVerticalAlignment(SwingConstants.CENTER);
			l_2.setHorizontalAlignment(SwingConstants.CENTER);
			l_2.setFont(new Font("Segoe Script", Font.BOLD, 75));
			l_2.setForeground(Color.RED);
		}
		l_2.setBounds(213, 174, 103, 85);
		getContentPane().add(l_2);

		if (i_pozucia3 == 0) {
			l_3 = new JLabel("3");
			l_3.setVerticalAlignment(SwingConstants.TOP);
			l_3.setHorizontalAlignment(SwingConstants.RIGHT);
			l_3.setFont(new Font("Segoe Script", Font.BOLD, 30));
			l_3.setForeground(Color.BLACK);

			l_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Zaputanna("Запитання", 3, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
							i_pozucia6, i_pozucia7, i_pozucia8, i_pozucia9);
					setVisible(false);
				}
			});

		} else {
			if (i_pozucia3 == 1) {
				l_3 = new JLabel("Х");
			} else {
				l_3 = new JLabel("0");
			}
			l_3.setVerticalAlignment(SwingConstants.CENTER);
			l_3.setHorizontalAlignment(SwingConstants.CENTER);
			l_3.setFont(new Font("Segoe Script", Font.BOLD, 75));
			l_3.setForeground(Color.RED);
		}
		l_3.setBounds(367, 174, 103, 85);
		getContentPane().add(l_3);

		if (i_pozucia4 == 0) {
			l_4 = new JLabel("4");
			l_4.setVerticalAlignment(SwingConstants.TOP);
			l_4.setHorizontalAlignment(SwingConstants.RIGHT);
			l_4.setFont(new Font("Segoe Script", Font.BOLD, 30));
			l_4.setForeground(Color.BLACK);

			l_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Zaputanna("Запитання", 4, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
							i_pozucia6, i_pozucia7, i_pozucia8, i_pozucia9);
					setVisible(false);
				}
			});

		} else {
			if (i_pozucia4 == 1) {
				l_4 = new JLabel("Х");
			} else {
				l_4 = new JLabel("0");
			}
			l_4.setVerticalAlignment(SwingConstants.CENTER);
			l_4.setHorizontalAlignment(SwingConstants.CENTER);
			l_4.setFont(new Font("Segoe Script", Font.BOLD, 75));
			l_4.setForeground(Color.RED);
		}
		l_4.setBounds(81, 286, 103, 85);
		getContentPane().add(l_4);

		if (i_pozucia5 == 0) {
			l_5 = new JLabel("5");
			l_5.setVerticalAlignment(SwingConstants.TOP);
			l_5.setHorizontalAlignment(SwingConstants.RIGHT);
			l_5.setFont(new Font("Segoe Script", Font.BOLD, 30));
			l_5.setForeground(Color.BLACK);

			l_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Zaputanna("Запитання", 5, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
							i_pozucia6, i_pozucia7, i_pozucia8, i_pozucia9);
					setVisible(false);
				}
			});

		} else {
			if (i_pozucia5 == 1) {
				l_5 = new JLabel("Х");
			} else {
				l_5 = new JLabel("0");
			}
			l_5.setVerticalAlignment(SwingConstants.CENTER);
			l_5.setHorizontalAlignment(SwingConstants.CENTER);
			l_5.setFont(new Font("Segoe Script", Font.BOLD, 75));
			l_5.setForeground(Color.RED);
		}
		l_5.setBounds(228, 286, 103, 85);
		getContentPane().add(l_5);

		if (i_pozucia6 == 0) {
			l_6 = new JLabel("6");
			l_6.setVerticalAlignment(SwingConstants.TOP);
			l_6.setHorizontalAlignment(SwingConstants.RIGHT);
			l_6.setFont(new Font("Segoe Script", Font.BOLD, 30));
			l_6.setForeground(Color.BLACK);

			l_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Zaputanna("Запитання", 6, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
							i_pozucia6, i_pozucia7, i_pozucia8, i_pozucia9);
					setVisible(false);
				}
			});

		} else {
			if (i_pozucia6 == 1) {
				l_6 = new JLabel("Х");
			} else {
				l_6 = new JLabel("0");
			}
			l_6.setVerticalAlignment(SwingConstants.CENTER);
			l_6.setHorizontalAlignment(SwingConstants.CENTER);
			l_6.setFont(new Font("Segoe Script", Font.BOLD, 75));
			l_6.setForeground(Color.RED);
		}
		l_6.setBounds(387, 286, 103, 85);
		getContentPane().add(l_6);

		if (i_pozucia7 == 0) {
			l_7 = new JLabel("7");
			l_7.setVerticalAlignment(SwingConstants.TOP);
			l_7.setHorizontalAlignment(SwingConstants.RIGHT);
			l_7.setFont(new Font("Segoe Script", Font.BOLD, 30));
			l_7.setForeground(Color.BLACK);

			l_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Zaputanna("Запитання", 7, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
							i_pozucia6, i_pozucia7, i_pozucia8, i_pozucia9);
					setVisible(false);
				}
			});

		} else {
			if (i_pozucia7 == 1) {
				l_7 = new JLabel("Х");
			} else {
				l_7 = new JLabel("0");
			}
			l_7.setVerticalAlignment(SwingConstants.CENTER);
			l_7.setHorizontalAlignment(SwingConstants.CENTER);
			l_7.setFont(new Font("Segoe Script", Font.BOLD, 75));
			l_7.setForeground(Color.RED);
		}
		l_7.setBounds(65, 399, 103, 85);
		getContentPane().add(l_7);

		if (i_pozucia8 == 0) {
			l_8 = new JLabel("8");
			l_8.setVerticalAlignment(SwingConstants.TOP);
			l_8.setHorizontalAlignment(SwingConstants.RIGHT);
			l_8.setFont(new Font("Segoe Script", Font.BOLD, 30));
			l_8.setForeground(Color.BLACK);

			l_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Zaputanna("Запитання", 8, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
							i_pozucia6, i_pozucia7, i_pozucia8, i_pozucia9);
					setVisible(false);
				}
			});

		} else {
			if (i_pozucia8 == 1) {
				l_8 = new JLabel("Х");
			} else {
				l_8 = new JLabel("0");
			}
			l_8.setVerticalAlignment(SwingConstants.CENTER);
			l_8.setHorizontalAlignment(SwingConstants.CENTER);
			l_8.setFont(new Font("Segoe Script", Font.BOLD, 75));
			l_8.setForeground(Color.RED);
		}
		l_8.setBounds(228, 399, 103, 85);
		getContentPane().add(l_8);

		if (i_pozucia9 == 0) {
			l_9 = new JLabel("9");
			l_9.setVerticalAlignment(SwingConstants.TOP);
			l_9.setHorizontalAlignment(SwingConstants.RIGHT);
			l_9.setFont(new Font("Segoe Script", Font.BOLD, 30));
			l_9.setForeground(Color.BLACK);

			l_9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Zaputanna("Запитання", 9, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
							i_pozucia6, i_pozucia7, i_pozucia8, i_pozucia9);
					setVisible(false);
				}
			});

		} else {
			if (i_pozucia9 == 1) {
				l_9 = new JLabel("Х");
			} else {
				l_9 = new JLabel("0");
			}
			l_9.setVerticalAlignment(SwingConstants.CENTER);
			l_9.setHorizontalAlignment(SwingConstants.CENTER);
			l_9.setFont(new Font("Segoe Script", Font.BOLD, 75));
			l_9.setForeground(Color.RED);
		}
		l_9.setBounds(387, 399, 103, 85);
		getContentPane().add(l_9);

		JLabel l_fon = new JLabel("");
		l_fon.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\Pole.png"));
		l_fon.setBounds(0, 0, 594, 565);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}
