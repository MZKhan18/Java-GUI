package javaGUI;

import java.awt.Color;
//import java.awt.Dimension;

import javax.swing.*;

;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
//		ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("fighterJet3.gif"));
		ImageIcon image= new ImageIcon("res/oppoent.png");
		ImageIcon image1= new ImageIcon("res/blueFireBall.png");
		ImageIcon bimage= new ImageIcon("res/bg1.jpg");
		
		JLabel blabel = new JLabel();
		blabel.setBackground(Color.black);
		blabel.setIcon(bimage);
		blabel.setOpaque(true);
		blabel.setBounds(0,0,1550,830);
		
		
		JLabel label2 = new JLabel();
		label2.setIcon(image1);
		label2.setBounds(100,50,122,160);
		
		JLabel label = new JLabel();
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.CENTER); //sets the vertical position of icon & text within label
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.BLUE);
//		label.setBackground(Color.black);
//		label.setOpaque(true);
		label.setBounds(100,650,122,160);
		
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label2);
		frame.add(label);
		frame.add(blabel);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setResizable(false);
//		frame.setUndecorated(true);
		frame.setSize(1550,840);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

			
	
	
}
