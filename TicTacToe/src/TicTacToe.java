import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;


public class TicTacToe {

	private JFrame frame;
	private JTextField turnField;
	private JTextField txtBlah;
	private JButton[][] m_allButtons = new JButton[3][3];
	private String m_previousMove = null;
	private static String s_X = "X";
	private static String s_O = "O";
	private int turns = 0;
	
	private int roundNum = 0;
	private Boolean playerTurn = false;

	private void checkWinner(){
		
		if (m_allButtons != null){
			
			for (int i = 0; i < 3; i++){
				String one = m_allButtons[i][0].getText();
				String two = m_allButtons[i][1].getText();
				String three = m_allButtons[i][2].getText();
				
				Boolean empty = one.isEmpty()||two.isEmpty()||three.isEmpty();
				
				if (!empty){
					
					Boolean same = (one == two)&&(two == three);
					
					if (same){
						m_allButtons[i][0].setBackground(Color.WHITE);
						m_allButtons[i][1].setBackground(Color.WHITE);
						m_allButtons[i][2].setBackground(Color.WHITE);
						disableButtons();
					}
					
				}
				
			}
			for (int i = 0; i < 3; i++){
				String one = m_allButtons[0][i].getText();
				String two = m_allButtons[1][i].getText();
				String three = m_allButtons[2][i].getText();
				
				Boolean empty = one.isEmpty()||two.isEmpty()||three.isEmpty();
				
				if (!empty){
					
					Boolean same = (one == two)&&(two == three);
					
					if (same){
						m_allButtons[0][i].setBackground(Color.WHITE);
						m_allButtons[1][i].setBackground(Color.WHITE);
						m_allButtons[2][i].setBackground(Color.WHITE);
						disableButtons();
					}
					
				}
				
			}
			
			// Diagnal check Block			
			String one = m_allButtons[0][0].getText();
			String two = m_allButtons[1][1].getText();
			String three = m_allButtons[2][2].getText();
			Boolean empty = one.isEmpty()||two.isEmpty()||three.isEmpty();
			if (!empty){
				
				Boolean same = (one == two)&&(two == three);
				
				if(same){
					m_allButtons[0][0].setBackground(Color.WHITE);
					m_allButtons[1][1].setBackground(Color.WHITE);
					m_allButtons[2][2].setBackground(Color.WHITE);
					disableButtons();
				}
				
			}
			
			// Diagnal check Block 2
			String oneone = m_allButtons[2][0].getText();
			String twotwo = m_allButtons[1][1].getText();
			String threethree = m_allButtons[0][2].getText();
			Boolean emptyempty = oneone.isEmpty()||twotwo.isEmpty()||threethree.isEmpty();
			if (!emptyempty){
				
				Boolean same = (oneone == twotwo)&&(twotwo == threethree);
				
				if(same){
					m_allButtons[2][0].setBackground(Color.WHITE);
					m_allButtons[1][1].setBackground(Color.WHITE);
					m_allButtons[0][2].setBackground(Color.WHITE);
					disableButtons();
				}
			}
				
				
			
			
			
			
		}
		
	}
	
	private void disableButton(){
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(10, 11, 74, 74);
		frame.getContentPane().add(button_1);
		m_allButtons[0][0] = button_1;
		
		JButton button_2 = new JButton("");
		button_2.setBounds(94, 11, 74, 74);
		frame.getContentPane().add(button_2);
		m_allButtons[0][1] = button_2;
		
		JButton button_3 = new JButton("");
		button_3.setBounds(178, 11, 74, 74);
		frame.getContentPane().add(button_3);
		m_allButtons[0][2] = button_3;
		
		JButton button_4 = new JButton("");
		button_4.setBounds(10, 96, 74, 74);
		frame.getContentPane().add(button_4);
		m_allButtons[1][0] = button_4;
		
		JButton button_5 = new JButton("");
		button_5.setBounds(94, 96, 74, 74);
		frame.getContentPane().add(button_5);
		m_allButtons[1][1] = button_5;
		
		JButton button_6 = new JButton("");
		button_6.setBounds(178, 96, 74, 74);
		frame.getContentPane().add(button_6);
		m_allButtons[1][2] = button_6;
		
		JButton button_7 = new JButton("");
		button_7.setBounds(10, 177, 74, 74);
		frame.getContentPane().add(button_7);
		m_allButtons[2][0] = button_7;
		
		JButton button_8 = new JButton("");
		button_8.setBounds(94, 177, 74, 74);
		frame.getContentPane().add(button_8);
		m_allButtons[2][1] = button_8;
		
		JButton button_9 = new JButton("");
		button_9.setBounds(178, 177, 74, 74);
		frame.getContentPane().add(button_9);
		m_allButtons[2][2] = button_9;
		addAllEvents();
		
		// GUI
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(262, 11, 13, 240);
		frame.getContentPane().add(separator);
		
		JLabel gameLabel = new JLabel("GAME");
		gameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		gameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gameLabel.setBounds(273, 40, 151, 14);
		frame.getContentPane().add(gameLabel);
		
		turnField = new JTextField();
		turnField.setEditable(false);
		turnField.setBounds(324, 65, 86, 20);
		frame.getContentPane().add(turnField);
		turnField.setColumns(10);
		
		JLabel playerTurn = new JLabel("Turn:");
		playerTurn.setBounds(285, 71, 46, 14);
		frame.getContentPane().add(playerTurn);
		
		JLabel lblRound = new JLabel("Round:");
		lblRound.setBounds(285, 95, 46, 14);
		frame.getContentPane().add(lblRound);
		
		txtBlah = new JTextField();
		txtBlah.setText("Blah");
		txtBlah.setEditable(false);
		txtBlah.setColumns(10);
		txtBlah.setBounds(324, 92, 86, 20);
		frame.getContentPane().add(txtBlah);
		
		JButton button = new JButton("");
		button.setEnabled(false);
		button.setBounds(273, 11, 151, 122);
		frame.getContentPane().add(button);
		
		JButton resetButton = new JButton("REST GAME");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enableButtons();
			}
		});
		resetButton.setBounds(273, 144, 151, 107);
		frame.getContentPane().add(resetButton);
		

	}
	
	private void changeButtonText(JButton button){
		if (m_previousMove != null){
			
			if (m_previousMove.equals(s_O)){
				button.setEnabled(false);
				button.setText(s_X);
				m_previousMove = s_X;
			}
			else if (m_previousMove.equals(s_X)){
				button.setEnabled(false);
				button.setText(s_O);
				m_previousMove = s_O;
			}
		}else{
			button.setEnabled(false);
			button.setText(s_X);
			m_previousMove = s_X;
		}
	}
	
	private void disableButtons(){
		if (m_allButtons != null){
			for (int i = 0; i<3; i++){
				for (int j = 0; j<3; j++){
					m_allButtons[i][j].setEnabled(false);
				}
				
			}
		}
	}
	
	private void enableButtons(){
		if (m_allButtons != null){
			for (int i = 0; i<3; i++){
				for (int j = 0; j<3; j++){
					m_allButtons[i][j].setEnabled(true);
					m_allButtons[i][j].setText("");
				}
				
			}
		}
	}
	
	private void addAllEvents(){
		if (m_allButtons != null){
			
			for (int i = 0; i<3; i++){
				
				for (int j = 0; j<3; j++){
					// Create event listener for all buttons
					JButton currentbutton = m_allButtons[i][j];
					currentbutton.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent e) {
							
							currentbutton.setEnabled(false);
							// Change the button text
							changeButtonText(currentbutton);
							checkWinner();
							turns++;
						}
					});
				}
				
			}
		}
	}
}
