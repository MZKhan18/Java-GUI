package javaGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Radiobutton extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JRadioButton pizzaButton;
	 JRadioButton hamburgerButton;
	 JRadioButton hotdogButton;
	 ImageIcon pizzaIcon;
	 ImageIcon hamburgerIcon;
	 ImageIcon hotdogIcon;
	 
	 Radiobutton(){
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setLayout(new FlowLayout());
	  
//	  pizzaIcon = new ImageIcon("res/refrsh.png");
//	  hamburgerIcon = new ImageIcon("res/rfrsh.png");
//	  hotdogIcon = new ImageIcon("res/refrsh.png");
	  
	  pizzaButton = new JRadioButton("pizza");            //creating new radio buttons and setting their texts as well
	  hamburgerButton = new JRadioButton("hamburger");
	  hotdogButton = new JRadioButton("hotdog");
	  
	  ButtonGroup group = new ButtonGroup();   //creating a button group so that no more than one radio button can be
	  group.add(pizzaButton);					// selected at a time
	  group.add(hamburgerButton);
	  group.add(hotdogButton);
	   
	  pizzaButton.addActionListener(this);             //adding action llistener to buttons
	  hamburgerButton.addActionListener(this);
	  hotdogButton.addActionListener(this);
	  
//	  pizzaButton.setIcon(pizzaIcon);
//	  hamburgerButton.setIcon(hamburgerIcon);
//	  hotdogButton.setIcon(hotdogIcon);
	  
	  this.add(pizzaButton);
	  this.add(hamburgerButton);
	  this.add(hotdogButton);
	  this.setLocationRelativeTo(null);
	  this.pack();
	  this.setVisible(true);
	 }
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource()==pizzaButton) {
			   System.out.println("You ordered pizza!");
			  }
			  else if(e.getSource()==hamburgerButton) {
			   System.out.println("You ordered a hamburger!");
			  }
			  else if(e.getSource()==hotdogButton) {
			   System.out.println("You ordered a hotdog!");
			  }
		
	}

	
}
