import java.awt.EventQueue;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewEvents_Frame {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEvents_Frame window = new ViewEvents_Frame();
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
	public ViewEvents_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 831, 511);
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
		JTextArea textArea_1 = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, textArea_1, 115, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textArea_1, 128, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textArea_1, -85, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textArea_1, -130, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textArea_1);
		Admin obb=new Admin();
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea_1));
		
		JButton btnNewButton = new JButton("back");
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
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 25, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 27, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 69, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 120, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		System.setOut(printStream);
		System.setErr(printStream);
		obb.ViewEvents();
	
	
		
	}
}
