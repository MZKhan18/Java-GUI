package javaGUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Checkbox extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	JCheckBox cb;
	ImageIcon diselected;
	ImageIcon selected;
	Checkbox(){
		
		diselected = new ImageIcon("res/refrsh.png");  //image when checkBox is selected
		selected = new ImageIcon("res/rfrsh.png");  //image when checkbox is not selected
		
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);
		
		cb = new JCheckBox();
		cb.setText("I'm not a robot");
		cb.setFocusable(false);
		cb.setFont(new Font("Consolas", Font.BOLD,25));
		cb.setIcon(diselected); //image when it is disselected
		cb.setSelectedIcon(selected);//image when it is selected
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); 
		this.add(button);
		this.add(cb);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button)
		{
			System.out.println(cb.isSelected());
			
		}
		
	}
		
}
