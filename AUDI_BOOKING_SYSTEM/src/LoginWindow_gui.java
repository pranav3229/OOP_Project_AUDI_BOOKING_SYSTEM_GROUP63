import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow_gui {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow_gui window = new LoginWindow_gui();
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
	public LoginWindow_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Enter your username");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 150, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, textField, -10, SpringLayout.EAST, lblNewLabel);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterYourPassword = new JLabel("Enter your password");
		springLayout.putConstraint(SpringLayout.NORTH, lblEnterYourPassword, 6, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, lblEnterYourPassword, 0, SpringLayout.EAST, lblNewLabel);
		frame.getContentPane().add(lblEnterYourPassword);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 6, SpringLayout.SOUTH, lblEnterYourPassword);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, textField);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		label = new JLabel("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textinput=textField.getText();
				String passwordinput=passwordField.getText();
				System.out.println(textinput);
				System.out.println(passwordinput);
				Login obb=new Login();
				if(textinput.equals("admin_admin")&&passwordinput.equals("takelite123")){
                    System.out.println("Logged in as admin");
                    frame.dispose();
    				EventQueue.invokeLater(new Runnable() {
    					public void run() {
    						try {
    							LoggedInAdmin_gui window = new LoggedInAdmin_gui();
    							window.frame.setVisible(true);
    						} catch (Exception e) {
    							e.printStackTrace();
    						}
    					}
    				});
                    
                }
				else 
				{
					if(obb.login(textinput, passwordinput)==69) {
					frame.dispose();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								LoggedInUserWindow_gui window = new LoggedInUserWindow_gui();
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
					else {
						label.setText("Invalid credentials, try again!");
					}
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 29, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, textField);
		frame.getContentPane().add(btnNewButton);
		
		
		springLayout.putConstraint(SpringLayout.NORTH, label, 38, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, label, -193, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(label);
	}

}
