package javaGUI;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello");
	
	NewWindow(){
		
		label.setBounds(100,100,100,50);
		label.setFont(new Font(null, Font.BOLD,25));
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	
}
