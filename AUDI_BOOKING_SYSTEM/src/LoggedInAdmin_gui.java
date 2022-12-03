//import java.awt.EventQueue;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class LoggedInAdmin_gui {

	JFrame frame;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public LoggedInAdmin_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 668, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							gui_audi window = new gui_audi();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Events and seats");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 113, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, 395, SpringLayout.WEST, frame.getContentPane());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EventQueue.invokeLater(new Runnable() {
					
					public void run() {
						try {
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
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add Events");
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 181, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 233, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, -259, SpringLayout.EAST, frame.getContentPane());
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frame.dispose();
							Add_Events_Frame_GUI window = new Add_Events_Frame_GUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Edit Events");
		btnNewButton_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_3, 233, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_3, -259, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -6, SpringLayout.NORTH, btnNewButton_3);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_3, 215, SpringLayout.NORTH, frame.getContentPane());
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frame.dispose();;
							Edit_Event_Frame_GUI window = new Edit_Event_Frame_GUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete Events");
		btnNewButton_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_4, 249, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_4, 233, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_4, -85, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_4, -259, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_3, -6, SpringLayout.NORTH, btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frame.dispose();
							Delete_Events_Frame_GUI window = new Delete_Events_Frame_GUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Track Revenue");
		btnNewButton_6.setAlignmentX(Component.CENTER_ALIGNMENT);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -6, SpringLayout.NORTH, btnNewButton_6);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_6, 147, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_6, -6, SpringLayout.NORTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_6, 233, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_6, -259, SpringLayout.EAST, frame.getContentPane());
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frame.dispose();
							
							Track_Revenue_GUI window = new Track_Revenue_GUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		frame.getContentPane().add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("Logged in as Admin");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 19, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 173, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -82, SpringLayout.NORTH, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 301, SpringLayout.EAST, btnNewButton);
		frame.getContentPane().add(lblNewLabel);
	}

}
