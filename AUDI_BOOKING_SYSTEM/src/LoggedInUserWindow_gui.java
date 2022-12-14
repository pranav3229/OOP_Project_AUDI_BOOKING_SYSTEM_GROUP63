import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoggedInUserWindow_gui {

	JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoggedInUserWindow_gui window = new LoggedInUserWindow_gui();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public LoggedInUserWindow_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1005, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
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
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 26, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 29, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 68, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 107, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show Events");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 114, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 364, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -492, SpringLayout.EAST, frame.getContentPane());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						try {
							frame.dispose();
							ShowEvents_GUI window = new ShowEvents_GUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Book Event");
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -30, SpringLayout.NORTH, btnNewButton_1_1);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1, 180, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1, 0, SpringLayout.WEST, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1, -492, SpringLayout.EAST, frame.getContentPane());
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						try {
							frame.dispose();
							BookEvent_GUI window = new BookEvent_GUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("View Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						try {
							frame.dispose();
							View_Cart_GUI window = new View_Cart_GUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 244, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -167, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1, -28, SpringLayout.NORTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, 0, SpringLayout.EAST, btnNewButton_1);
		frame.getContentPane().add(btnNewButton_2);
	}

}
