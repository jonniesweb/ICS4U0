package review;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Woodstock extends JFrame {

	private JPanel contentPane;
	private JTextField studentfield;
	private JTextField adultfield;
	private JTextField seniorfield;
	private JTextField vipfield;
	
	JLabel lbltotal = new JLabel("");
	
	
	int student = 0, adult = 0, senior = 0, vip = 0;
	int total = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		try {
		    // Set cross-platform Java L&F (also called "Metal")
	        UIManager.setLookAndFeel(
	            UIManager.getSystemLookAndFeelClassName());
	    } 
	    catch (UnsupportedLookAndFeelException e) {
	       // handle exception
	    }
	    catch (ClassNotFoundException e) {
	       // handle exception
	    }
	    catch (InstantiationException e) {
	       // handle exception
	    }
	    catch (IllegalAccessException e) {
	       // handle exception
	    }

		
		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Woodstock frame = new Woodstock();
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
	public Woodstock() {
		setTitle("Buy Woodstock Tickets");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudent = new JLabel("Student $8");
		lblStudent.setBounds(10, 36, 114, 14);
		contentPane.add(lblStudent);
		
		JLabel lblAdult = new JLabel("Adult $20");
		lblAdult.setBounds(10, 61, 114, 14);
		contentPane.add(lblAdult);
		
		JLabel lblSenior = new JLabel("Senior $8");
		lblSenior.setBounds(10, 86, 114, 14);
		contentPane.add(lblSenior);
		
		
		JLabel lblEnterTheAmount = new JLabel("Enter the amount of tickets that you want to buy");
		lblEnterTheAmount.setBounds(10, 11, 239, 14);
		contentPane.add(lblEnterTheAmount);
		
		studentfield = new JTextField();
		studentfield.setText("0");
		studentfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				calculate();
			}
		});
		studentfield.setBounds(134, 36, 86, 20);
		contentPane.add(studentfield);
		studentfield.setColumns(10);

		
		adultfield = new JTextField();
		adultfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				calculate();
			}
		});
		adultfield.setText("0");
		adultfield.setBounds(134, 61, 86, 20);
		contentPane.add(adultfield);
		adultfield.setColumns(10);
		
		seniorfield = new JTextField();
		seniorfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				calculate();
			}
		});

		seniorfield.setText("0");
		seniorfield.setBounds(134, 86, 86, 20);
		contentPane.add(seniorfield);
		seniorfield.setColumns(10);
		
		JLabel lblVipTickets = new JLabel("VIP Tickets $30");
		lblVipTickets.setBounds(10, 111, 114, 14);
		contentPane.add(lblVipTickets);
		
		vipfield = new JTextField();
		vipfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				calculate();
			}
		});

		vipfield.setText("0");
		vipfield.setBounds(134, 111, 86, 20);
		contentPane.add(vipfield);
		vipfield.setColumns(10);
		lbltotal.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lbltotal.setBounds(10, 136, 247, 14);
		contentPane.add(lbltotal);
	}
	
	void calculate() {

		try {
			student = Integer.parseInt(studentfield.getText());
		} catch (NumberFormatException e) {
			studentfield.setText("0");
		}
		try {
			adult = Integer.parseInt(adultfield.getText());
		} catch (NumberFormatException e) {
			adultfield.setText("0");
		}
		try {
			senior = Integer.parseInt(seniorfield.getText());
		} catch (NumberFormatException e) {
			seniorfield.setText("0");
		}
		try {
			vip = Integer.parseInt(vipfield.getText());
		} catch (NumberFormatException e) {
			vipfield.setText("0");
		}
		
		if (vip > student + adult + senior) {
			
			lbltotal.setText("You cannot have more vip tickets than total tickets");
			
		} else {
			
			total = (student * 8) + (adult * 20) + (senior * 8) + (vip * 30);
			
			lbltotal.setText("Your total is: $" + total);
		}
		
	}
}
