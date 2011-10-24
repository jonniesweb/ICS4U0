package methods;

// various required imports
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// define class
public class Calculator extends JFrame {

	//define gui items
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textout;
	private JTextField textin1;
	private JTextField textin2;

	
	// launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	// contsructor
	public Calculator() {
		
		// Set gui options
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// text box
		textin1 = new JTextField();
		textin1.setBounds(12, 34, 114, 19);
		contentPane.add(textin1);
		textin1.setColumns(10);
		
		// text box
		textin2 = new JTextField();
		textin2.setBounds(141, 34, 114, 19);
		contentPane.add(textin2);
		textin2.setColumns(10);
		
		// label
		JLabel lblNumber = new JLabel("Number 1");
		lblNumber.setBounds(12, 7, 70, 15);
		contentPane.add(lblNumber);
		
		// label
		JLabel lblNumber_1 = new JLabel("Number 2");
		lblNumber_1.setBounds(140, 7, 70, 15);
		contentPane.add(lblNumber_1);
		
		// multiply button and method to multiply
		JRadioButton rdbtnMultiply = new JRadioButton("Multiply");
		rdbtnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double one = Double.parseDouble(textin1.getText());
				double two = Double.parseDouble(textin2.getText());
				double ans = one * two;
				
				
				textout.setText(Double.toString(ans));
				
			}
		});
		buttonGroup.add(rdbtnMultiply);
		rdbtnMultiply.setBounds(139, 61, 149, 23);
		contentPane.add(rdbtnMultiply);
		
		// divide button and method to divide
		JRadioButton rdbtnDivide = new JRadioButton("Divide");
		rdbtnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double one = Double.parseDouble(textin1.getText());
				double two = Double.parseDouble(textin2.getText());
				double ans = one / two;
				
				
				textout.setText(Double.toString(ans));
				
			}
		});
		buttonGroup.add(rdbtnDivide);
		rdbtnDivide.setBounds(139, 88, 149, 23);
		contentPane.add(rdbtnDivide);
		
		// add button and method to add
		JRadioButton rdbtnAdd = new JRadioButton("Add");
		rdbtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double one = Double.parseDouble(textin1.getText());
				double two = Double.parseDouble(textin2.getText());
				double ans = one + two;
				
				
				textout.setText(Double.toString(ans));
				
			}
		});
		buttonGroup.add(rdbtnAdd);
		rdbtnAdd.setBounds(12, 61, 114, 23);
		contentPane.add(rdbtnAdd);
		
		// subtract button and method to subtract
		JRadioButton rdbtnSubtract = new JRadioButton("Subtract");
		rdbtnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double one = Double.parseDouble(textin1.getText());
				double two = Double.parseDouble(textin2.getText());
				double ans = one - two;
				
				
				textout.setText(Double.toString(ans));
				
			}
		});
		buttonGroup.add(rdbtnSubtract);
		rdbtnSubtract.setBounds(12, 88, 114, 23);
		contentPane.add(rdbtnSubtract);
		
		// output field
		textout = new JTextField();
		textout.setBounds(76, 135, 114, 19);
		contentPane.add(textout);
		textout.setColumns(10);
		
		// output label
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(98, 119, 70, 15);
		contentPane.add(lblOutput);
	}
}
