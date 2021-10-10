package quiz;

import java.awt.*; 
import javax.swing.*;

public class AlgorithmQuizApp extends JFrame {
 
	private static final long serialVersionUID = 1L;
	
	AlgorithmQuizApp(){
		setBounds(200, 100, 790, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 255, 255));
		setLayout(null); 
		
//		App icon
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("img/image.jpg"));
		
		JLabel iconLabel = new JLabel(icon);
		iconLabel.setBounds(0, 0, 400, 450);
		add(iconLabel);
		
//		App Title
		JLabel titleLabel = new JLabel("Algoritham Quiz");
		titleLabel.setBounds(280, 40, 300, 50);
		titleLabel.setFont(new Font("Ink Free", Font.BOLD, 35));
		titleLabel.setForeground(new Color(1, 84, 134));
		add(titleLabel);
		
//		App Descriptions
		JTextArea descLabel = new JTextArea(); 
		descLabel.setText( 
			 "Hello!!, we are Algorithm Quiz App. We help to\n"
			 + "improve your algoritham sloving techanics. "
			 + "\nWe will happy to have you here." 
				);
		descLabel.setBounds(380, 130, 400, 80);
		descLabel.setFont(new Font("MV Boil", Font.PLAIN, 16));
		descLabel.setForeground(new Color(1, 84, 134));
		add(descLabel);
		
//		Player Name label
		JLabel nameLabel = new JLabel("Enter your name ");
		nameLabel.setBounds(380, 240, 300, 18);
		nameLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		nameLabel.setForeground(new Color(1, 84, 134));
		add(nameLabel);
		
//		Player Name text field
		JTextField nameTextField = new JTextField();
		nameTextField.setBounds(380, 270, 250, 30);
		nameTextField.setFont(new Font("Viner Hand ITC", Font.PLAIN, 16));
		nameTextField.setForeground(new Color(1, 84, 134));
		add(nameTextField);
		
//		Start Button
		JButton startButton = new JButton("Start");
		startButton.setBounds(380, 350, 100, 35);
		startButton.setHorizontalAlignment(JLabel.CENTER);
		startButton.setFont(new Font("MV Boil", Font.BOLD, 18));
		startButton.setBackground(new Color(1, 84, 134));
		startButton.setForeground(new Color(255, 255, 255));
		add(startButton);

//		Exit Button
		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(600, 350, 100, 35);
		exitButton.setHorizontalAlignment(JLabel.CENTER);
		exitButton.setFont(new Font("MV Boil", Font.BOLD, 18));
		exitButton.setBackground(new Color(1, 84, 134));
		exitButton.setForeground(new Color(255, 255, 255));
		add(exitButton);
		
		setResizable(false);
	}
	public static void main(String[] args) { 
		
		new AlgorithmQuizApp();
		

	}

}
