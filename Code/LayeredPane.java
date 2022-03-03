package javaGUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LayeredPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		JLayeredPane = swing container that provides a third dimension for positioning components
//		                  example- depth , Z-index
		
		
		
		JLabel label1 = new JLabel();
		label1.setBounds(50,50,200,200);
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		
		JLabel label2 = new JLabel();
		label2.setBounds(100,100,200,200);
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		
		JLabel label3 = new JLabel();
		label3.setBounds(150,150,200,200);
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		
		
		JLayeredPane lpane = new JLayeredPane();   //creating JLayeredPane
		lpane.setBounds(0,0,500,500);
		
		lpane.add(label1, Integer.valueOf(1));         //adding components to the LayeredPane with their position 
		lpane.add(label2, Integer.valueOf(2));
		lpane.add(label3, Integer.valueOf(3));

//		lpane.add(label1, JLayeredPane.DEFAULT_LAYER);         //this are the predefined layers that we can use for positioning or layering the 
//		lpane.add(label2, JLayeredPane.DRAG_LAYER);             components. DEFAULT_LAYER is the bottom layer and DRAG_LAYER is the top layer.
//		lpane.add(label3, JLayeredPane.DEFAULT_LAYER);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.add(lpane);
		frame.setVisible(true);

	}

}
