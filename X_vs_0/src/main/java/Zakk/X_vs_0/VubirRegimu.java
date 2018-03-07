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

public class VubirRegimu extends JFrame {

	private static final long serialVersionUID = 1L;

	public VubirRegimu(String s) {
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

		JLabel l_Komentar = new JLabel("Оберіть,  будь  ласка,  режим");
		l_Komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_Komentar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		l_Komentar.setBounds(12, 136, 570, 31);
		getContentPane().add(l_Komentar);

		JLabel l_OdunGravec = new JLabel("Один гравець");
		l_OdunGravec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Object[] options = { "Хрестики", "Нулики" };
				int i_menu = JOptionPane.showOptionDialog(null, "Оберіть стиль:", "Хрестики vs Нулики",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
				if (i_menu == 0) {
					new Games("Хрестики vs Нулики", 1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
					setVisible(false);
				} else {
					new Games("Хрестики vs Нулики", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
					setVisible(false);
				}
			}
		});
		l_OdunGravec.setForeground(new Color(255, 0, 0));
		l_OdunGravec.setHorizontalAlignment(SwingConstants.CENTER);
		l_OdunGravec.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 39));
		l_OdunGravec.setBounds(12, 178, 570, 43);
		getContentPane().add(l_OdunGravec);

		JLabel l_DvaGravci = new JLabel("Два гравці");
		l_DvaGravci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Games("Хрестики vs Нулики", 2, 0, 0, 0, 0, 0, 0, 0, 0, 0);
				setVisible(false);
			}
		});
		l_DvaGravci.setForeground(new Color(255, 0, 0));
		l_DvaGravci.setHorizontalAlignment(SwingConstants.CENTER);
		l_DvaGravci.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 39));
		l_DvaGravci.setBounds(12, 234, 570, 43);
		getContentPane().add(l_DvaGravci);

		JLabel l_Kartunka = new JLabel("");
		l_Kartunka.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\fon_Regum.png"));
		l_Kartunka.setBounds(0, 266, 594, 299);
		getContentPane().add(l_Kartunka);

		JLabel l_fon = new JLabel("");
		l_fon.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\fon_White.PNG"));
		l_fon.setBounds(0, 0, 594, 565);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}
