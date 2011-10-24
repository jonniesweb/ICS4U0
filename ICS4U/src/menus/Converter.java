// By Jonnie Simpson
// program that converts decimal, binary and hex interchangeably

package menus;

// imports
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// class declaration extending JFrame for gui
public class Converter extends JFrame {

	//define some shared objects for the gui
	private JPanel contentPane;
	private JTextField textinput;
	private JTextField textoutput;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	// initiate the main program in a thread
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter frame = new Converter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Converter method
	public Converter() {

		// set window options
		setResizable(false);
		setTitle("Universal Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// text input
		textinput = new JTextField();
		textinput.setBounds(18, 23, 114, 19);
		contentPane.add(textinput);
		textinput.setColumns(10);

		// text output
		textoutput = new JTextField();
		textoutput.setBounds(154, 23, 114, 19);
		contentPane.add(textoutput);
		textoutput.setColumns(10);

		// decimal input button
		final JRadioButton rdcdecimal = new JRadioButton("Decimal");
		rdcdecimal.setSelected(true);
		buttonGroup.add(rdcdecimal);
		rdcdecimal.setBounds(18, 62, 90, 23);
		contentPane.add(rdcdecimal);

		// binary input button
		final JRadioButton rdcbinary = new JRadioButton("Binary");
		buttonGroup.add(rdcbinary);
		rdcbinary.setBounds(18, 89, 90, 23);
		contentPane.add(rdcbinary);

		// hex input button
		final JRadioButton rdchex = new JRadioButton("Hex");
		buttonGroup.add(rdchex);
		rdchex.setBounds(18, 116, 90, 23);
		contentPane.add(rdchex);

		// decimal output button
		final JRadioButton rdodecimal = new JRadioButton("Decimal");
		rdodecimal.setSelected(true);
		buttonGroup_1.add(rdodecimal);
		rdodecimal.setBounds(154, 62, 90, 23);
		contentPane.add(rdodecimal);

		// binary output button
		final JRadioButton rdobinary = new JRadioButton("Binary");
		buttonGroup_1.add(rdobinary);
		rdobinary.setBounds(154, 89, 90, 23);
		contentPane.add(rdobinary);

		// hex output button
		final JRadioButton rdohex = new JRadioButton("Hex");
		buttonGroup_1.add(rdohex);
		rdohex.setBounds(154, 116, 90, 23);
		contentPane.add(rdohex);

		// input label
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(18, 0, 70, 15);
		contentPane.add(lblInput);

		// output label
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(154, 0, 70, 15);
		contentPane.add(lblOutput);

		// convert button does the conversion
		// run it in its own thread
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					// if the output is decimal
					if (rdodecimal.isSelected()) {

						// if the input is decimal, output the input
						if (rdcdecimal.isSelected()) {
							textoutput.setText(textinput.getText());

							// if the input is binary, convert it
						} else if (rdcbinary.isSelected()) {

							String input = textinput.getText();
							int num = Integer.parseInt(input, 2);
							textoutput.setText(Integer.toString(num));

							// if the input is hex, convert it
						} else if (rdchex.isSelected()) {

							int i = Integer.parseInt(textinput.getText(), 16);
							textoutput.setText(Integer.toString(i));

						}

						// if the output is binary
					} else if (rdobinary.isSelected()) {

						// if the input is decimal, convert it
						if (rdcdecimal.isSelected()) {

							textoutput.setText(Integer.toBinaryString(Integer.parseInt(textinput.getText())));

							// if the input is decimal, output the input
						} else if (rdcbinary.isSelected()) {

							textoutput.setText(textinput.getText());

							// if the input is hex, convert it
						} else if (rdchex.isSelected()) {

							int i = Integer.parseInt(textinput.getText(), 16);
							String s = Integer.toString(i);

							textoutput.setText(Integer.toBinaryString(Integer.parseInt(s)));

						}


						// if the output is hex
					} else if (rdohex.isSelected()) {

						// if the input is decimal, convert it
						if (rdcdecimal.isSelected()) {

							textoutput.setText(Integer.toHexString(Integer.parseInt(textinput.getText())));

							// if the input is binary, convert it
						} else if (rdcbinary.isSelected()) {

							textoutput.setText(Integer.toHexString(Integer.parseInt(textinput.getText(), 2)));

							// if the input is hex, output the input
						} else if (rdchex.isSelected()) {

							textoutput.setText(textinput.getText());

						}

					}
					// handle illegal inputs by the ways of doing nothing
				} catch (NumberFormatException e) {
				}



			}
		});
		// set the size and add to the gui
		btnConvert.setBounds(80, 147, 117, 25);
		contentPane.add(btnConvert);
	}
}
