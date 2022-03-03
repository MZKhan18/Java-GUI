package javaGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_Layout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Layout Manager = Defines the natural layout for components within a container
		
		// FlowLayout = places components in a row , sized at their preferred size.
//						if horizontal space in the container is too small, 
//							the FlowLayout class uses the next available row.
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));//set FlowLayout and give the alignment of the components (default is center);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());
		
		
		
		frame.add(new JButton("1"));//shortcut method to initialize or create components
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
//		frame.add(panel);
		frame.setVisible(true);
	}

}
