package arrays;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class Height extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt10;
	private JTextField txt9;
	private JTextField txt8;
	private JTextField txt7;
	private JTextField txt6;
	private JLabel lblTheBiggestNumber;
	
	private double[] list = new double[10];
	private JTextField input[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Height frame = new Height();
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
	public Height() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterHeights = new JLabel("Enter 10 heights in cm");
		lblEnterHeights.setBounds(12, 12, 247, 15);
		contentPane.add(lblEnterHeights);
		
		txt1 = new JTextField();
		txt1.setBounds(12, 34, 114, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(12, 60, 114, 19);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(12, 86, 114, 19);
		contentPane.add(txt3);
		
		txt4 = new JTextField();
		txt4.setColumns(10);
		txt4.setBounds(12, 117, 114, 19);
		contentPane.add(txt4);
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		txt5.setBounds(12, 148, 114, 19);
		contentPane.add(txt5);
		
		txt10 = new JTextField();
		txt10.setColumns(10);
		txt10.setBounds(138, 148, 114, 19);
		contentPane.add(txt10);
		
		txt9 = new JTextField();
		txt9.setColumns(10);
		txt9.setBounds(138, 117, 114, 19);
		contentPane.add(txt9);
		
		txt8 = new JTextField();
		txt8.setColumns(10);
		txt8.setBounds(138, 86, 114, 19);
		contentPane.add(txt8);
		
		txt7 = new JTextField();
		txt7.setColumns(10);
		txt7.setBounds(138, 60, 114, 19);
		contentPane.add(txt7);
		
		txt6 = new JTextField();
		txt6.setColumns(10);
		txt6.setBounds(138, 34, 114, 19);
		contentPane.add(txt6);
		
		lblTheBiggestNumber = new JLabel("The biggest number is:");
		lblTheBiggestNumber.setBounds(12, 207, 247, 15);
		contentPane.add(lblTheBiggestNumber);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		btnCalculate.setBounds(9, 170, 243, 25);
		contentPane.add(btnCalculate);
	}

	private void calculate() {
		

		list[0] = getValue(txt1);
		list[1] = getValue(txt2);
		list[2] = getValue(txt3);
		list[3] = getValue(txt4);
		list[4] = getValue(txt5);
		list[5] = getValue(txt6);
		list[6] = getValue(txt7);
		list[7] = getValue(txt8);
		list[8] = getValue(txt9);
		list[9] = getValue(txt10);
		
		double biggest = 0;
		
		for (double i : list) {
			if (i > biggest) {
				biggest = i;
			}
		}
		lblTheBiggestNumber.setText("The biggest number is: " + biggest + "cm");
	}
	
	private double getValue(JTextField field) {
		
		double number;
		
		try {
			number = Double.parseDouble(field.getText());
		} catch (NumberFormatException e) {
			return 0;
		}
		
		return number;
		
	}
}
