package clientGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class Client  {

	private JFrame frame;
	private JTextField userNameField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Client() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 385, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello");
				
			}
		});
				
		
		JLabel lblNewLabel_3 = new JLabel("Smart Automated Cloud Environment");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(58, 11, 269, 41);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("User Service");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(40, 63, 93, 23);
		frame.getContentPane().add(lblNewLabel_2);	
		
		
		JLabel lblNewLabel_4 = new JLabel("UserName:");
		lblNewLabel_4.setBounds(37, 98, 63, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		userNameField = new JTextField();
		userNameField.setBounds(110, 95, 86, 20);
		frame.getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Password:");
		lblNewLabel_5.setBounds(40, 133, 60, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(110, 130, 86, 20);
		frame.getContentPane().add(passwordField_1);
		
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		loginButton.setBounds(230, 129, 72, 23);
		frame.getContentPane().add(loginButton);
		
		JLabel lblNewLabel_1 = new JLabel("Database Service");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(40, 177, 112, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton file1RadioButton = new JRadioButton("Select File 1");
		file1RadioButton.setBounds(40, 198, 109, 23);
		frame.getContentPane().add(file1RadioButton);
		
		JRadioButton file2RadioButton = new JRadioButton("Select File 2");
		file2RadioButton.setBounds(40, 224, 109, 23);
		frame.getContentPane().add(file2RadioButton);
		
		JRadioButton file3RadioButton = new JRadioButton("Select File3");
		file3RadioButton.setBounds(40, 250, 109, 23);
		frame.getContentPane().add(file3RadioButton);
		
		JLabel lblNewLabel = new JLabel("VM Service");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(40, 297, 93, 23);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JCheckBox computeCheckBox = new JCheckBox("Compute");
		computeCheckBox.setBounds(40, 327, 97, 23);
		frame.getContentPane().add(computeCheckBox);
		
		JCheckBox storageCheckBox = new JCheckBox("Storage");
		storageCheckBox.setBounds(40, 353, 97, 23);
		frame.getContentPane().add(storageCheckBox);
		
		JCheckBox generalCheckBox = new JCheckBox("General Purpose");
		generalCheckBox.setBounds(40, 379, 97, 23);
		frame.getContentPane().add(generalCheckBox);
		
		JButton vmButton = new JButton("View VM");
		vmButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		vmButton.setBounds(230, 385, 89, 23);
		frame.getContentPane().add(vmButton);
	}
}
