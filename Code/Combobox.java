package javaGUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Combobox extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JComboBox comboBox;
	 
	 Combobox(){
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setLayout(new FlowLayout()); 
	  
	  String[] animals = {"dog","cat","bird"};
	  
	  comboBox = new JComboBox(animals);
	  comboBox.addActionListener(this);
	  
//	  comboBox.setEditable(true);  // makes the combo box editable
//	  System.out.println(comboBox.getItemCount());  // gives the count of items in combobox
//	  comboBox.addItem("horse"); // add an item to combo box
//	  comboBox.insertItemAt("pig", 0); //inserts item at given index without replacing the existing items 
//	  comboBox.setSelectedIndex(0); it makes the index selected by default
//	  comboBox.removeItem("cat");  // removes the item from combo box by name
	  //comboBox.removeItemAt(0); //removes item by index 
	  //comboBox.removeAllItems(); //removes all items 
	  
	  this.add(comboBox);
	  this.setLocationRelativeTo(null);
	  this.pack();
	  this.setVisible(true);
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
	  if(e.getSource()==comboBox) {
	   System.out.println(comboBox.getSelectedItem());
//	   System.out.println(comboBox.getSelectedIndex());  // returns the index of selected item  
	  }
	 }
	}

