import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BookEvent_GUI {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookEvent_GUI window = new BookEvent_GUI();
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
	public BookEvent_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1179, 573);
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
							LoggedInUserWindow_gui window = new LoggedInUserWindow_gui();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 30, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 26, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 65, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 128, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, textArea, 44, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textArea, 103, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, textArea, 371, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textArea, 855, SpringLayout.EAST, btnNewButton);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Enter the id number of the event you want to book");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 36, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -96, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField, 61, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, textField, 0, SpringLayout.SOUTH, lblNewLabel);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Submit");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 76, SpringLayout.SOUTH, textArea);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 496, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -43, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -129, SpringLayout.EAST, frame.getContentPane());
		Customer obc=new Customer();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							obc.BookEvent(Integer.parseInt(textField.getText()),Integer.parseInt(textField_1.getText()));
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
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		
		JLabel lblNewLabel_1 = new JLabel("Enter the seat number that you want to book");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 82, SpringLayout.EAST, textField);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, -312, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		System.setOut(printStream);
		System.setErr(printStream);
		obb.ViewEvents();
	}

}
