package javaGUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MyFrame extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;  // makes the button global
	JLabel label;
	MyFrame(){
		ImageIcon icon = new ImageIcon("res/ham1.png");
		ImageIcon icon1 = new ImageIcon("res/logo.jpg");
		
		label = new JLabel();
		label.setIcon(icon1);
		label.setBounds(150,300,150,150);
		label.setVisible(false);
		
		button = new JButton();  // creates new jButton
		button.setBounds(100,100,200,200); //sets the bounds of button
		button.addActionListener(this);  // adds the ActionListener to the button
		button.setText("Punch");     //sets the text on button  
		button.setFocusable(false);    // removes the border from the button text
		// one alternate method to do this action is using linda  expression , then no need to implement ActionListener
		//button.addActionListener(e -> System.out.println("hello"));
		button.setIcon(icon); //sets icon of the button
		button.setHorizontalTextPosition(JButton.CENTER);   //sets horizontal text position
        button.setVerticalTextPosition(JButton.BOTTOM);     //sets vertical text position
		button.setFont(new Font("Comic Sans",Font.BOLD,25)); //sets the font type of button
		button.setIconTextGap(15);  //sets the gap between the icon and text
		button.setForeground(Color.cyan);  // sets foreground color
		button.setBackground(Color.black); // sets background color
		button.setBorder(BorderFactory.createEtchedBorder()); //sets border
//		button.setEnabled(false);  //sets button enabled or disabled
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		this.setLayout(null);
		this.setResizable(false); 
		this.setSize(500,500); 
		this.setVisible(true); 		
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Smash");
//			button.setEnabled(false);  // this will disable the button after the first button clicked
			label.setVisible(true);   //displays the label when button clicked
 		}
		
	}

}
