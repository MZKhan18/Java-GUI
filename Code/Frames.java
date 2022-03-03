package javaGUI;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frames {
	public static void main(String[] args) {
		// JLabel = a GUI to display area for a string of text, an image or both
		JFrame frame = new JFrame();
		
		frame.setTitle("M Z Khan"); //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // exit out of application by clicking X button
		frame.setResizable(false); //prevents the frame to be resized
		frame.setSize(400,400); // sets x and y dimension of frame
		frame.setUndecorated(true);
		
		ImageIcon image = new ImageIcon("res/logo.jpg"); //create an ImageIcon
		frame.setIconImage(image.getImage());  // change icon of frame
		frame.getContentPane().setBackground(new Color(90,100,255));// value from 0-255 RED, GREEN, BLUE
		frame.setLayout(null); //sets the layout >> now the label will not be visible because we have to set its bounds
		frame.setVisible(true); // it will make the frame visible
//		frame.pack(); 
//		it is a method of JFrame which automatically sets its size according to the elements present in it >> to use this, remove the setBounds of label
//		and also remove the setLayout of JFrame and setSize of JFrame
}
}