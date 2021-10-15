package quiz;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

public class ScoreBoard extends JFrame implements ActionListener{
 
	private static final long serialVersionUID = 1L;

	JButton cancelButton, playAgeButton, showAnsButton;
	
	public ScoreBoard(int scores) { 
		setBounds(250, 50, 700, 600);
		getContentPane().setBackground(new Color(246, 246, 246));
		setLayout(null);
		setResizable(false);
		 
//		App icon
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("img/image.jpg"));
		JLabel iconLabel = new JLabel(icon);
		iconLabel.setBounds(80, 150, 200, 200);
		add(iconLabel);
	

//		Score of label
		JLabel titleLabel = new JLabel("Java Quzies ");
		titleLabel.setBounds(280, 40, 400, 30);
		titleLabel.setFont(new Font("Ink Free", Font.BOLD, 25));
		titleLabel.setForeground(new Color(1, 84, 134)); 
		add(titleLabel);
		
		
		JLabel score = new JLabel("");
		score.setBounds(350, 250, 400, 30);
		score.setFont(new Font("MV Boil", Font.BOLD, 24));
		score.setForeground(new Color(1, 84, 134)); 
		score.setText("Your score is " + scores);
		add(score);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(530, 450, 100, 40);
		cancelButton.setForeground(new Color(246, 246, 246));
		cancelButton.setBackground(new Color(1, 84, 134));
		cancelButton.setFont(new Font("MV Boil", Font.BOLD, 18));
		cancelButton.addActionListener(this);
		cancelButton.setFocusable(false);
		add(cancelButton);
		
		playAgeButton = new JButton("Play Agean");
		playAgeButton.setBounds(40, 450, 165, 40);
		playAgeButton.setForeground(new Color(246, 246, 246));
		playAgeButton.setBackground(new Color(1, 84, 134));
		playAgeButton.setFont(new Font("MV Boil", Font.BOLD, 18));
		playAgeButton.addActionListener(this);
		playAgeButton.setFocusable(false);
		add(playAgeButton);

		 	
	}

	public void actionPerformed(ActionEvent e) { 
		
		if(e.getSource() == cancelButton) {
			System.exit(0);
		}else if(e.getSource() == playAgeButton) {
			this.setVisible(false);
			new JavaQuziesMain().setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		 new ScoreBoard(0).setVisible(true);

	} 
}
