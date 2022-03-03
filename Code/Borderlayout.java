package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Borderlayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//layout manager = defines the natural layout for component within a container
		
		//3 common managers
		
		//BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER.
		//               all extra space is placed in the center area

		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10,10));  //sets borderLayout >> (10,10) sets margin (vertical,horizontal)
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel(); //creating panel
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);	// changing color of panels
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel1.setPreferredSize(new Dimension(100,100));	//setting preferred size of panel
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		
//---------------------------------SUB PANELS------------------------------------//
		
		JPanel panel6 = new JPanel(); //creating panel
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.pink);	// changing color of panels
		panel7.setBackground(Color.cyan);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.orange);
		panel10.setBackground(Color.white);
		
		panel6.setPreferredSize(new Dimension(50,50));	//setting preferred size of panel
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		panel5.setLayout(new BorderLayout());
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.WEST);
		panel5.add(panel8,BorderLayout.EAST);
		panel5.add(panel9,BorderLayout.SOUTH);
		panel5.add(panel10,BorderLayout.CENTER);
		
		
//---------------------------------SUB PANELS------------------------------------//		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);

	}

}
