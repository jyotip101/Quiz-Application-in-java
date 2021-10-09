package quiz;

import java.awt.Color;

import javax.swing.*;

public class AlgorithmQuizApp extends JFrame {

	AlgorithmQuizApp(){
		setBounds(200, 200, 1000, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		black getContentPane().setBackground(new Color(43, 50, 56));
//		green getContentPane().setBackground(new Color(137, 172, 88));
		getContentPane().setBackground(new Color(255, 255, 255));
		
		setResizable(false);
	}
	public static void main(String[] args) { 
		
		new AlgorithmQuizApp();
		

	}

}
