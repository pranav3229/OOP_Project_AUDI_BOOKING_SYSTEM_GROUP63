import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.awt.event.ActionEvent;

public class Edit_Event_Frame_GUI {
	

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit_Event_Frame_GUI window = new Edit_Event_Frame_GUI();
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
	public Edit_Event_Frame_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 858, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		Admin obb=new Admin();
		class CustomOutputStream extends OutputStream {
		    private JTextArea textArea;
		    public CustomOutputStream(JTextArea textArea) {
		        this.textArea = textArea;
		    }
		     
		    @Override
		    public void write(int b) throws IOException {
		        // redirects data to the text area
		        textArea.append(String.valueOf((char)b));
		        // scrolls the text area to the end of data
		        textArea.setCaretPosition(textArea.getDocument().getLength());
		    }
		}
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
EventQueue.invokeLater(new Runnable() {
					
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
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 34, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 37, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 75, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 140, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, textArea, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textArea, 50, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, textArea, 217, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textArea, 784, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Enter the ID number of the event you want to edit");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 55, SpringLayout.SOUTH, textArea);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 37, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 89, SpringLayout.SOUTH, textArea);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 275, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 8, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textField, 75, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, textField, -7, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, textField, 158, SpringLayout.EAST, lblNewLabel);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		
		JLabel lblNewLabel_1 = new JLabel("Enter the new Event name");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 2, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 7, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, -10, SpringLayout.EAST, lblNewLabel_1);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1_1 = new JButton("Submit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							obb.EditEvent(Integer.parseInt(textField.getText()),obb.setChoice(1),textField_1.getText());
							frame.dispose();
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										ViewEvents_Frame window = new ViewEvents_Frame();
										window.frame.setVisible(true);
										System.out.println("Event name changed");
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
							
							
						} catch (Exception e) {
//							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1, 6, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1, 0, SpringLayout.WEST, btnNewButton);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter the id number of the event you want to edit and hit submit only for the field you want to edit");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 20, SpringLayout.SOUTH, textArea);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, -169, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter the new ticket price");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 57, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, 0, SpringLayout.SOUTH, lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField_2, 0, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, -10, SpringLayout.EAST, lblNewLabel_3);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1_1_1 = new JButton("Submit");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							obb.EditEvent(Integer.parseInt(textField.getText()),obb.setChoice(2),textField_2.getText());
							frame.dispose();
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										ViewEvents_Frame window = new ViewEvents_Frame();
										window.frame.setVisible(true);
										System.out.println("Ticket price changed");
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
							
						} catch (Exception e) {
//							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_1, 0, SpringLayout.NORTH, btnNewButton_1_1);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_1, 0, SpringLayout.EAST, lblNewLabel);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Enter the new event description");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, 0, SpringLayout.SOUTH, lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea textArea_1 = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, textArea_1, 4, SpringLayout.SOUTH, lblNewLabel_4);
		springLayout.putConstraint(SpringLayout.WEST, textArea_1, 55, SpringLayout.EAST, textField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, textArea_1, 57, SpringLayout.SOUTH, lblNewLabel_4);
		springLayout.putConstraint(SpringLayout.EAST, textArea_1, 0, SpringLayout.EAST, lblNewLabel_4);
		frame.getContentPane().add(textArea_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Submit");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							obb.EditEvent(Integer.parseInt(textField.getText()),obb.setChoice(3),textArea_1.getText());
							frame.dispose();
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										ViewEvents_Frame window = new ViewEvents_Frame();
										window.frame.setVisible(true);
										System.out.println("Event Description changed");
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
							
						} catch (Exception e) {
//							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_1_1, 6, SpringLayout.SOUTH, textArea_1);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_1_1, 386, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Note: You can edit only one field at a time");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 6, SpringLayout.SOUTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_5, -322, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Enter the changed number of seats");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 0, SpringLayout.NORTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_6, 74, SpringLayout.EAST, lblNewLabel_4);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.NORTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, textField_3, 102, SpringLayout.EAST, textArea_1);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Submit");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							obb.EditEvent(Integer.parseInt(textField.getText()),obb.setChoice(4),textField_3.getText());
							frame.dispose();
							
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										ViewEvents_Frame window = new ViewEvents_Frame();
										window.frame.setVisible(true);
										System.out.println("Number of seats available changed");
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
							
						} catch (Exception e) {
//							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_1_1_1, 0, SpringLayout.NORTH, btnNewButton_1_1);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_1_1_1, 0, SpringLayout.EAST, lblNewLabel_2);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);
//		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		System.setOut(printStream);
		System.setErr(printStream);
		obb.ViewEvents();

		
	}

}
