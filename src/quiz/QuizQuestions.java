package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class QuizQuestions extends JFrame implements ActionListener {
 
	private static final long serialVersionUID = 1L;

	QuizQuestions() {
		setBounds(250, 50, 900, 600);
		getContentPane().setBackground(new Color(246, 246, 246));
		setLayout(null);
		setResizable(false);
		 
//		App icon
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("img/image.jpg"));
		JLabel iconLabel = new JLabel(icon);
		iconLabel.setBounds(80, 10, 200, 200);
		add(iconLabel);
		
//		user name Title
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(500, 40, 300, 50);
		nameLabel.setFont(new Font("MV Boil", Font.BOLD, 18));
		nameLabel.setForeground(new Color(1, 84, 134));
		add(nameLabel);

//		user name Title
		JLabel timeLabel = new JLabel("Name: ");
		timeLabel.setBounds(500, 100, 300, 50);
		timeLabel.setFont(new Font("MV Boil", Font.BOLD, 18));
		timeLabel.setForeground(new Color(1, 84, 134));
		add(timeLabel);
	
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) { 
		
		
	}
 
	public static void main(String[] args) {
		new QuizQuestions();
	}  
}
