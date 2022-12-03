import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.awt.event.ActionEvent;

public class Track_Revenue_GUI {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Track_Revenue_GUI window = new Track_Revenue_GUI();
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
	public Track_Revenue_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1368, 762);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
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
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 40, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 32, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 77, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 103, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, textArea, 61, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textArea, 13, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, textArea, 374, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textArea, -142, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Enter the idno for which you want to track the revenue");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 80, SpringLayout.SOUTH, textArea);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 58, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textField, 62, SpringLayout.EAST, lblNewLabel);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						try {
							frame.dispose();
							Thread t=new Thread(){
								public void run(){
									Admin ob=new Admin();
									ob.TrackRevenue(Integer.parseInt(textField.getText()));
								}
							};
							t.start();
							LoggedInAdmin_gui window = new LoggedInAdmin_gui();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 102, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 29, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, 189, SpringLayout.EAST, textField);
		frame.getContentPane().add(btnNewButton_1);
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		Admin obb=new Admin();
		System.setOut(printStream);
		System.setErr(printStream);
		obb.ViewEvents();
				
	}

}
