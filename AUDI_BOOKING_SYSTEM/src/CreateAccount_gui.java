

import java.awt.EventQueue;

import javax.swing.*;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateAccount_gui {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount_gui window = new CreateAccount_gui();
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
	public CreateAccount_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 542, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Enter your name");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, lblNewLabel);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterYourPhone = new JLabel("Enter your phone number");
		springLayout.putConstraint(SpringLayout.WEST, lblEnterYourPhone, 57, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblEnterYourPhone, 0, SpringLayout.SOUTH, lblNewLabel);
		frame.getContentPane().add(lblEnterYourPhone);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, -10, SpringLayout.EAST, lblEnterYourPhone);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		JLabel lblEnterYourEmail = new JLabel("Enter your email address");
		springLayout.putConstraint(SpringLayout.SOUTH, lblEnterYourEmail, 0, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblEnterYourEmail, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lblEnterYourEmail);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 10, SpringLayout.WEST, lblEnterYourEmail);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEnterAUnique = new JLabel("Enter a unique userID");
		springLayout.putConstraint(SpringLayout.EAST, lblEnterAUnique, 0, SpringLayout.EAST, lblEnterYourPhone);
		frame.getContentPane().add(lblEnterAUnique);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_3, 108, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblEnterAUnique, -6, SpringLayout.NORTH, textField_3);
		springLayout.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField_1);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEnterAUnique_1 = new JLabel("Enter the passowrd");
		springLayout.putConstraint(SpringLayout.NORTH, lblEnterAUnique_1, 17, SpringLayout.SOUTH, textField_3);
		springLayout.putConstraint(SpringLayout.EAST, lblEnterAUnique_1, 0, SpringLayout.EAST, lblEnterYourPhone);
		frame.getContentPane().add(lblEnterAUnique_1);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 6, SpringLayout.SOUTH, lblEnterAUnique_1);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 10, SpringLayout.WEST, lblEnterAUnique_1);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, -10, SpringLayout.EAST, lblEnterAUnique_1);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login ob=new Login();
				String namefield=textField.getText();
				String phonefield=textField_1.getText();
				String emailfield=textField_2.getText();
				String useridfield=textField_3.getText();
				String passwordfield=passwordField.getText();
				System.out.println(namefield);
				System.out.println(phonefield);
				System.out.println(emailfield);
				System.out.println(useridfield);
				System.out.println(passwordfield);

//				ob.CreateAccount(namefield, phonefield, emailfield, useridfield,passwordfield);
				frame.dispose();
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						try {
							frame.dispose();
							Thread t=new Thread(){
								public void run(){
									try {
										ob.CreateAccount(namefield, phonefield, emailfield, useridfield,passwordfield);
									}catch(Exception e) {
										System.out.println(e);
									}
								}
							};
							t.start();
							gui_audi window = new gui_audi();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblEnterAUnique);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -24, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						try {
							frame.dispose();

							gui_audi window = new gui_audi();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, -145, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -24, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -65, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_1);
	}
}
