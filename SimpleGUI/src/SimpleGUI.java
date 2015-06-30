import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;


public class SimpleGUI {

	private JFrame frame;
	private JTextField nameTextField;
	private JTextField textField;
	private JLabel studentLabel;
	private JButton pushButton;
	private static String s_whoAreYou = "Who are you?";
	private static String s_clearMe = "Clear Me!";
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGUI window = new SimpleGUI();
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
	public SimpleGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nameLabel = new JLabel("My name is");
		nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameLabel.setBounds(108, 64, 72, 14);
		frame.getContentPane().add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(191, 62, 130, 17);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel ageLabel = new JLabel("I am");
		ageLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		ageLabel.setBounds(121, 93, 60, 14);
		frame.getContentPane().add(ageLabel);
		
		textField = new JTextField();
		textField.setBounds(191, 90, 130, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		studentLabel = new JLabel("I am a student of Year Up");
		studentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		studentLabel.setBounds(121, 153, 200, 14);
		frame.getContentPane().add(studentLabel);
		
		pushButton = new JButton(s_whoAreYou);
		pushButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (pushButton.getText().equals(s_whoAreYou)){
					nameTextField.setText("Shanon Copeland");
					textField.setText("24");
					pushButton.setText(s_clearMe);
				}
				else if (pushButton.getText().equals(s_clearMe)){
					nameTextField.setText("");
					textField.setText("");
					pushButton.setText(s_whoAreYou);
				}
			}
			
		});
		pushButton.setBounds(121, 178, 200, 50);
		frame.getContentPane().add(pushButton);
		
		separator = new JSeparator();
		separator.setBounds(121, 128, 200, 14);
		frame.getContentPane().add(separator);
	}
}
