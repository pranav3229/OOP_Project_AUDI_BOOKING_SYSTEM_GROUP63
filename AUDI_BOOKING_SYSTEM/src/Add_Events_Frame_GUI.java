import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_Events_Frame_GUI {

	JFrame frame;
	private JTextField textField;
	private JLabel lblEnterTheTicket;
	private JTextField textField_1;
	private JLabel lblEnterTheEvent;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Events_Frame_GUI window = new Add_Events_Frame_GUI();
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
	public Add_Events_Frame_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1066, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	SwingUtilities.invokeLater(new Runnable() {
					
					public void run() {
						try {
							frame.dispose();
							LoggedInAdmin_gui window = new LoggedInAdmin_gui();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 35, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 36, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 68, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 111, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Enter the event name");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 48, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 61, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 81, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 159, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, lblNewLabel);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblEnterTheTicket = new JLabel("Enter the ticket price");
		springLayout.putConstraint(SpringLayout.NORTH, lblEnterTheTicket, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblEnterTheTicket, 85, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblEnterTheTicket, 0, SpringLayout.SOUTH, lblNewLabel);
		frame.getContentPane().add(lblEnterTheTicket);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, lblEnterTheTicket);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_1, 0, SpringLayout.SOUTH, textField);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblEnterTheEvent = new JLabel("Enter the event description");
		springLayout.putConstraint(SpringLayout.NORTH, lblEnterTheEvent, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblEnterTheEvent, 84, SpringLayout.EAST, lblEnterTheTicket);
		frame.getContentPane().add(lblEnterTheEvent);
		
		textArea = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, textArea, 3, SpringLayout.SOUTH, lblEnterTheEvent);
		springLayout.putConstraint(SpringLayout.WEST, textArea, 33, SpringLayout.EAST, textField_1);
		springLayout.putConstraint(SpringLayout.SOUTH, textArea, -170, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textArea, -207, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textArea);
		
		btnNewButton_1 = new JButton("Add Event");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
SwingUtilities.invokeLater(new Runnable() {
					
					public void run() {
						try {
							Admin obb=new Admin();
							obb.AddEvent(textField.getText(), textField_1.getText(), textArea.getText(),textField_2.getText());
							frame.dispose();
							ViewEvents_Frame window = new ViewEvents_Frame();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, -87, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 313, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -66, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -383, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("Enter total number of seats present");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, lblEnterTheEvent);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, textArea);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, -25, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
