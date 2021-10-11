package quiz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RulesPage extends JFrame{
 
	private static final long serialVersionUID = 1L;

	
	public RulesPage() { 
		setBounds(250, 100, 500, 600);
		getContentPane().setBackground(new Color(246, 246, 246));
		setLayout(null);
		
		JLabel titleLabel = new JLabel("Rules of the Algoritham Quzi.");
		titleLabel.setBounds(70, 30, 400, 30);
		titleLabel.setFont(new Font("Ink Free", Font.BOLD, 25));
		titleLabel.setForeground(new Color(1, 84, 134)); 
		add(titleLabel);
		
		setVisible(true);
	}

	public static void main(String[] args) { 
		new RulesPage();
	}

}
