package jim.charles.stock.alert;

import java.awt.EventQueue;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.JInternalFrame;
import javax.swing.JTextField;
//import javax.swing.JWindow;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
//import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
//import java.awt.HeadlessException;
//import javax.swing.SwingConstants;
import javax.swing.JTextArea;
//import javax.swing.Box;
//import javax.swing.JTextPane;

public class Ui 
{
	private JFrame frame;
	private JTextField symboInput;
	private JTextField emailInput;
	private JTextField textInput;
	private JTextField priceInput;
	private JTextField lastName;
	private JTextField firstName;
	private Boolean isValid = false;
	private Boolean hasContact = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Ui window = new Ui();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Stock Alert");

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		symboInput = new JTextField();
		symboInput.setBounds(155, 100, 130, 26);
		panel.add(symboInput);
		symboInput.setColumns(10);


		JLabel lblSymbo = new JLabel("Symbol:");
		lblSymbo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSymbo.setBounds(51, 104, 53, 16);
		panel.add(lblSymbo);

		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPrice.setBounds(51, 146, 61, 16);
		panel.add(lblPrice);

		emailInput = new JTextField();
		emailInput.setBounds(155, 178, 130, 26);
		panel.add(emailInput);
		emailInput.setColumns(10);

		textInput = new JTextField();
		textInput.setBounds(155, 213, 130, 26);
		panel.add(textInput);
		textInput.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(isValid == false)
				{
					JOptionPane.showMessageDialog(frame, "Error!\n Please check your stock symbol!");
				}
				else
				{
					if (emailInput.getText().isEmpty() && textInput.getText().isEmpty())
					{
						JOptionPane.showMessageDialog(frame, "Error!\n" 
								+ " You must enter an email or phone number!");
					}
					else 
					{
						hasContact = true;


						GetInfo.setFirstName(firstName.getText());
						GetInfo.setLastName(lastName.getText());
						GetInfo.setEmail(emailInput.getText());
						GetInfo.setSymbol(symboInput.getText().toUpperCase());
						GetInfo.setUserPrice(priceInput.getText());
						GetInfo.setPhoneNumber(textInput.getText());
					
						JOptionPane.showMessageDialog(frame, "Thank you for choosing StockAlert! "
								+ GetInfo.getFirstName() + "\n An alert message has been sent to you!");

						if(!emailInput.getText().isEmpty() && hasContact)
						{
							Email.sendEmail(GetInfo.getEmail(), welcomeMessage());
						}
						if (!textInput.getText().isEmpty() && hasContact)
						{
							Text.sendText("Text Message.txt", welcomeMessage());
						}
						frame.dispose();
						new Helper();
					}
				}
			}
		});
		btnSubmit.setBounds(168, 245, 117, 29);
		panel.add(btnSubmit);

		priceInput = new JTextField();
		priceInput.setText("$0.00");
		priceInput.setBounds(155, 142, 130, 26);
		panel.add(priceInput);
		priceInput.setColumns(10);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEmail.setBounds(51, 183, 72, 21);
		panel.add(lblEmail);

		JLabel lblText = new JLabel("Text:");
		lblText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblText.setBounds(51, 213, 72, 21);
		panel.add(lblText);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLastName.setBounds(51, 64, 72, 15);
		panel.add(lblLastName);

		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(155, 59, 130, 26);
		panel.add(lastName);

		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(155, 23, 130, 26);
		panel.add(firstName);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFirstName.setBounds(51, 22, 82, 26);
		panel.add(lblFirstName);

		//Button to find stock and determine if the symbol is valid
		JButton btnFind = new JButton("Find");
		btnFind.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				GetInfo.setSymbol(symboInput.getText().toUpperCase());
				GetInfo.setUserPrice(priceInput.getText());
				try
				{
					JOptionPane.showMessageDialog(frame, "Stock Found!\n Current price for "
							+ GetInfo.getSymbol()+" is $" + GetPrice.price());
					isValid = true;
				}
				catch (RuntimeException e1)
				{
					JOptionPane.showMessageDialog(frame, "Error!\n" 
							+ GetInfo.getSymbol() + " is not found!");
					isValid = false;
				}
			}
		});
		btnFind.setBounds(305, 101, 93, 23);
		panel.add(btnFind);

		JTextArea txtrInstruction = new JTextArea();
		txtrInstruction.setText("Instruction:\nPlease fill in all the information.\n"
				+ "Please hit \"find\" button before you submit the form.\n"
				+ "Thank you again for using StockAlert!");
		txtrInstruction.setBounds(51, 306, 383, 121);
		panel.add(txtrInstruction);
	}

	private String welcomeMessage()
	{
		return "Hello "+GetInfo.getFirstName()+" " + GetInfo.getLastName()+"!\n"+
				"Thanks for signing up for Stock Alert! \nWe will send "
				+ "you an email when " + GetInfo.getSymbol() + " is at " 
				+ GetInfo.getUserPrice() + ". \n The current price of "
				+ GetInfo.getSymbol() + " is $" + GetPrice.price() 
				+ ".\n Thanks Again!";
	}
}