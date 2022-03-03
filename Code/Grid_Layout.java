package javaGUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid_Layout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Layout Manager = Defines the natural layout for components within a container
//		GridLayout = places components in a grid of cells.
//					Each component takes all the available space within its cells
//					and each cell is the same size

				
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3,10,10));// sets grid layout to frame. 
//							GridLayout(No. of Rows, No. of Columns, Horizontal margin, Vertical Margin)
		
		frame.add(new JButton("1"));//shortcut method to initialize or create components
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
//		frame.add(new JButton("10"));
		
		frame.setVisible(true);
	}

}
