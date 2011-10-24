package arrays;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Checkerboard extends JFrame {

	private JPanel contentPane;
	private JButton[][] grid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkerboard frame = new Checkerboard();
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
	public Checkerboard() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(8, 8, 0, 0));

		boolean count = true;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 4d; j++) {

				if (count == true) {
					contentPane.add(new ButtonRed().getButton());
					contentPane.add(new ButtonBlack().getButton());

				} else {
					contentPane.add(new ButtonBlack().getButton());
					contentPane.add(new ButtonRed().getButton());

				}


			}

			if (count == true) {
				count = false;
			} else {
				count = true;
			}
		}


	}

	public class ButtonRed extends JButton {
		public JButton getButton() {
			setBackground(Color.RED);
			return this;
		}
	}

	public class ButtonBlack extends JButton {
		public JButton getButton() {
			setBackground(Color.BLACK);
			return this;
		}
	}


}
