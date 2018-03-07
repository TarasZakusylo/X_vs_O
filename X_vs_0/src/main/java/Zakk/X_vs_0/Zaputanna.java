package Zakk.X_vs_0;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Zaputanna extends JFrame {

	private static final long serialVersionUID = 1L;

	private static String[][] Reading_Vidpovid = new String[1][1];

	String s_putanna = "";
	String s_putanna1 = "";

	private Scanner scanner_Vidpovid;

	public Zaputanna(String s, final int i_NomerPytanna, final int i_pozucia1, final int i_pozucia2,
			final int i_pozucia3, final int i_pozucia4, final int i_pozucia5, final int i_pozucia6,
			final int i_pozucia7, final int i_pozucia8, final int i_pozucia9) {
		super(s);

		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 238);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("putanna/" + i_NomerPytanna + ".txt"));

			String line;
			List<String> lines = new ArrayList<String>();

			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
			String[] linesAsArray = lines.toArray(new String[lines.size()]);

			for (int i = 0; i < linesAsArray.length; i++) {
				s_putanna = s_putanna + linesAsArray[i];
			}

			int i_s_putanna = s_putanna.length();

			if (i_s_putanna > 26) {

				char[] chars = s_putanna.toCharArray();

				s_putanna = "";

				for (int i = 0; i < chars.length; i++) {
					if (i < 25) {
						s_putanna = s_putanna + chars[i];
					} else {
						s_putanna1 = s_putanna1 + chars[i];
					}
				}

				String s_perenos = "";
				int i_k_perenos = 0;

				chars = s_putanna.toCharArray();

				for (int i = chars.length - 1; i > 0; i--) {
					if (chars[i] != ' ') {
						s_perenos = s_perenos + chars[i];
					} else {
						break;
					}
					i_k_perenos++;
				}

				// System.out.println("s_perenos " + s_perenos);
				// System.out.println("i_k_perenos " + i_k_perenos);

				// s_putanna -3 sumvola

				s_putanna = "";

				for (int i = 0; i < chars.length - 1 - i_k_perenos; i++) {
					s_putanna = s_putanna + chars[i];
				}

				// System.out.println("s_putanna " + s_putanna);

				// konvertuu

				char[] chars_perenos = s_perenos.toCharArray();
				s_perenos = "";

				for (int i = chars_perenos.length - 1; i >= 0; i--) {
					s_perenos = s_perenos + chars_perenos[i];
				}

				// System.out.println("s_perenos " + s_perenos);

				// s_putanna1 + konvektor

				s_putanna1 = s_perenos + s_putanna1;

				// System.out.println("s_putanna1 " + s_putanna1);

			}

		} catch (Exception e1) {
			s_putanna = "Помилка.";
			s_putanna1 = "У системі відсутнє запитання.";
		}

		JLabel l_Tak = new JLabel("Так");
		l_Tak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				vidpovid(i_NomerPytanna, 1, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
				setVisible(false);
			}
		});
		l_Tak.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 35));
		l_Tak.setHorizontalAlignment(SwingConstants.CENTER);
		l_Tak.setBounds(12, 142, 269, 48);
		getContentPane().add(l_Tak);

		JLabel l_No = new JLabel("Ні");
		l_No.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vidpovid(i_NomerPytanna, 0, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
				setVisible(false);
			}
		});
		l_No.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 35));
		l_No.setHorizontalAlignment(SwingConstants.CENTER);
		l_No.setBounds(313, 142, 269, 48);
		getContentPane().add(l_No);

		JLabel label_2 = new JLabel(s_putanna);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		label_2.setBounds(12, 13, 570, 48);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel(s_putanna1);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		label_3.setBounds(12, 74, 570, 48);
		getContentPane().add(label_3);

		setVisible(true);
	}

	protected void vidpovid(int i_NomerPytanna, int i_vidpovidKorustuvaca, int i_pozucia1, int i_pozucia2,
			int i_pozucia3, int i_pozucia4, int i_pozucia5, int i_pozucia6, int i_pozucia7, int i_pozucia8,
			int i_pozucia9) {

		int i_vidpovid = 0;

		try {
			scanner_Vidpovid = new Scanner(new File("vidpovidi/" + i_NomerPytanna + ".txt"));

			while (scanner_Vidpovid.hasNext()) {
				for (int row = 0; row < Reading_Vidpovid.length; row++) {
					for (int col = 0; col < Reading_Vidpovid[row].length; col++) {
						i_vidpovid = Integer.parseInt(scanner_Vidpovid.next());
					}
				}
			}

			scanner_Vidpovid.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Помилка. У системі відсутня відповідь.");
		}

		switch (i_NomerPytanna) {
		case 1: {
			if (i_vidpovidKorustuvaca == i_vidpovid) {
				new Games("Хрестики vs Нулики", 2, 1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
			} else {
				new Games("Хрестики vs Нулики", 2, 2, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
			}
		}
			break;
		case 2: {
			if (i_vidpovidKorustuvaca == i_vidpovid) {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, 1, i_pozucia3, i_pozucia4, i_pozucia5, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
			} else {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, 2, i_pozucia3, i_pozucia4, i_pozucia5, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
			}
		}
			break;
		case 3: {
			if (i_vidpovidKorustuvaca == i_vidpovid) {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, 1, i_pozucia4, i_pozucia5, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
			} else {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, 2, i_pozucia4, i_pozucia5, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
			}
		}
			break;
		case 4: {
			if (i_vidpovidKorustuvaca == i_vidpovid) {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, 1, i_pozucia5, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
			} else {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, 2, i_pozucia5, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
			}
		}
			break;
		case 5: {
			if (i_vidpovidKorustuvaca == i_vidpovid) {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, 1, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
			} else {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, 2, i_pozucia6,
						i_pozucia7, i_pozucia8, i_pozucia9);
			}
		}
			break;
		case 6: {
			if (i_vidpovidKorustuvaca == i_vidpovid) {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5, 1,
						i_pozucia7, i_pozucia8, i_pozucia9);
			} else {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5, 2,
						i_pozucia7, i_pozucia8, i_pozucia9);
			}
		}
			break;
		case 7: {
			if (i_vidpovidKorustuvaca == i_vidpovid) {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
						i_pozucia6, 1, i_pozucia8, i_pozucia9);
			} else {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
						i_pozucia6, 2, i_pozucia8, i_pozucia9);
			}
		}
			break;
		case 8: {
			if (i_vidpovidKorustuvaca == i_vidpovid) {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
						i_pozucia6, i_pozucia7, 1, i_pozucia9);
			} else {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
						i_pozucia6, i_pozucia7, 2, i_pozucia9);
			}
		}
			break;
		case 9: {
			if (i_vidpovidKorustuvaca == i_vidpovid) {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
						i_pozucia6, i_pozucia7, i_pozucia8, 1);
			} else {
				new Games("Хрестики vs Нулики", 2, i_pozucia1, i_pozucia2, i_pozucia3, i_pozucia4, i_pozucia5,
						i_pozucia6, i_pozucia7, i_pozucia8, 2);
			}
		}
			break;
		}
	}
}
