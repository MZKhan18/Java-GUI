package javaGUI;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptoionpane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//JOptionpane = pop up a standard dialog box that prompts users for a value or informs them of something
		
		JOptionPane.showMessageDialog(null, "Hello", "plain",JOptionPane.PLAIN_MESSAGE);    //plain message type with no icon
		JOptionPane.showMessageDialog(null, "your code is ok", "info",JOptionPane.INFORMATION_MESSAGE); // info message with info icon
		JOptionPane.showMessageDialog(null, "do you need any hint", "question",JOptionPane.QUESTION_MESSAGE);  //question type with question mark
		JOptionPane.showMessageDialog(null, "Your code has bugs!", "waring",JOptionPane.WARNING_MESSAGE);  //is a warning message with icon
		JOptionPane.showMessageDialog(null, "there is an error!!!", "error",JOptionPane.ERROR_MESSAGE);  // is error message with error icon
		
		JOptionPane.showConfirmDialog(null, "are you a coder", "user",JOptionPane.YES_NO_CANCEL_OPTION ); //returns the index of the option selected
		System.out.println(JOptionPane.showConfirmDialog(null, "are you a coder", "returning the input",JOptionPane.YES_NO_CANCEL_OPTION )); //else returns -1
		
//		int ans = JOptionPane.showConfirmDialog(null, "are you a coder", "stroring input",JOptionPane.YES_NO_CANCEL_OPTION ); //you can store the input in variable
		
		String name = JOptionPane.showInputDialog("What is your name"); //takes input from user 
		System.out.println("hello "+ name);
		ImageIcon icon = new ImageIcon("res/logo.jpg"); // add your own icon to the dialog box
		String[] options = {"thank you","NO, you are osm","i know"}; // create your own options to be displayed on the dialog box
		JOptionPane.showOptionDialog(
				null, //parent component
				"You are osm", //message
				"title", // title
				JOptionPane.YES_NO_CANCEL_OPTION, //option type 
				JOptionPane.INFORMATION_MESSAGE, //message type
				icon, // add your own icon
				options, //add your own options
				0); // default index that will be selected

	}

}
