package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JPanel = a GUI component that functions as a container to hold other components
				ImageIcon icon = new ImageIcon("res/logo.jpg");
				JLabel label = new JLabel();
				label.setText("Hello");
				label.setIcon(icon);
//				label.setVerticalAlignment(JLabel.TOP);      // use these methods only if the panel or frame has a border layout
//				label.setHorizontalAlignment(JLabel.RIGHT); // if frame or panel has a null layout, these methods don't work
				label.setBounds(10,10,75,75);
				
				
				//RED PANEL
				JPanel redPanel = new JPanel();
				redPanel.setBackground(Color.red);
				redPanel.setBounds(0,0,250,250);
				redPanel.setLayout(null);
				
				//BLUE PANEL
				JPanel bluePanel = new JPanel();
				bluePanel.setBackground(Color.blue);
				bluePanel.setBounds(250,0,250,250);
				bluePanel.setLayout(null);
				
				
				//GREEN PANEL
				JPanel greenPanel = new JPanel(); //create a panel
				greenPanel.setBackground(Color.green); //sets color
				greenPanel.setBounds(0,250,500,250);  //sets bound >> x,y,length, breadth
				greenPanel.setLayout(new BorderLayout()); //sets border layout to the panel
				
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(750,750);
				frame.setLayout(null); //sets the layout >> now the label will not be visible because we have to set its bounds
				frame.setVisible(true);
				greenPanel.add(label); // label is not showing in greenPanel because greenPanel has border layouts
				bluePanel.add(label);// adding label to panels  >>label is not showing in greenPanel because bluePanel has null layouts
				frame.add(redPanel);  //adding panels to JFrame
				frame.add(bluePanel);
				frame.add(greenPanel);
				
				
	}

}
