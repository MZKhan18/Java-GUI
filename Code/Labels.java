package javaGUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {

	public static void main(String[] args) {
		// JLabel = a GUI to display area for a string of text, an image or both
		ImageIcon pic= new ImageIcon("res/ham1.png");
		Border border = BorderFactory.createLineBorder(Color.green,3); //creating border
		
		JLabel label = new JLabel();  //create a label
		label.setText(("Hello world")); //sets text of label OR one more way is that: JLabel label = new JLabel("Hello World");
		label.setIcon(pic); //sets icon or image on label
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT, of imageIcon
		label.setVerticalTextPosition(JLabel.TOP); //set text at TOP, CENTER, BOTTOM of imageIcon
		label.setForeground(Color.BLUE); //sets color of text  // or new Color(0,0,0);
		label.setFont(new Font("My Boli",Font.PLAIN,20)); //set font of text
		label.setIconTextGap(10);  // sets the gap between text and image icon >> it can be positive(to make text far) or negative(to make text closer)
		label.setBackground(Color.black);  //sets background color
		label.setOpaque(true); // this will display the background color
		label.setBorder(border); //adding border to label
		label.setVerticalAlignment(JLabel.CENTER); //sets the vertical position of icon & text within label
		label.setHorizontalAlignment(JLabel.CENTER); //sets the horizontal position of icon & text within label
		label.setBounds(100,100,200,200); // sets bounds of label >> x coordinate dimension, y coordinate, length , breadth
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null); //sets the layout >> now the label will not be visible because we have to set its bounds
		frame.setVisible(true);
		frame.add(label);
//		frame.pack(); 
//		it is a method of JFrame which automatically sets its size according to the elements present in it >> to use this, remove the setBounds of label
//		and also remove the setLayout of JFrame and setSize of JFrame
	}
}
