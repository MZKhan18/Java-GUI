package javaGUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NewWindowLauncher implements ActionListener{
	JFrame frame = new JFrame();
	JButton button = new JButton("New Window");
	NewWindowLauncher(){
		button.setBounds(150,150,200,60);
		button.setFont(new Font(null, Font.BOLD,25));
		button.setFocusable(false);
		button.addActionListener(this);   //adding action listener to the button
		
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {  //checking if the button is pressed or not
			frame.dispose();            //closes the NewWindowLauncher window as soon as we click the button
			new NewWindow();  //calls the NewWindow window frame
			
		}
	}

}
