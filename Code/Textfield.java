package javaGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Textfield extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField textfield;
	JButton button;
	Textfield(){
		
		 textfield = new JTextField();
		textfield.setPreferredSize(new Dimension(250,40));
		textfield.setFont(new Font("consolas",Font.PLAIN,35));
		textfield.setForeground(Color.green);
		textfield.setBackground(Color.black);
		textfield.setCaretColor(Color.white);	
//		textfield.setText("username");
//		textfield.setEditable(false);
		
		button = new JButton("Submit");
		button.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); 
		
		this.add(textfield);
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button)
		{
			System.out.println("hello "+textfield.getText());
			textfield.setEditable(false);
			button.setEnabled(false);
		}
		
	}

	
	
	
}
