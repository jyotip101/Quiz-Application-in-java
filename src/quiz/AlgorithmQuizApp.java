package quiz;

import java.awt.*; 
import javax.swing.*;

public class AlgorithmQuizApp extends JFrame {
 
	private static final long serialVersionUID = 1L;
	
	AlgorithmQuizApp(){
		setBounds(200, 200, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		black getContentPane().setBackground(new Color(43, 50, 56));
//		green getContentPane().setBackground(new Color(137, 172, 88));
		getContentPane().setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("img/image.jpg"));
		
		JLabel iconLabel = new JLabel(icon);
		iconLabel.setBounds(0, 0, 400, 500);
		add(iconLabel);
		
		JLabel
		
		setResizable(false);
	}
	public static void main(String[] args) { 
		
		new AlgorithmQuizApp();
		

	}

}
