package javaGUI;
import javax.swing.*;

public class GraphicFrame extends JFrame{
 
	GraphicPanel panel;
 
 GraphicFrame(){
  
  panel = new GraphicPanel();
  
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  this.add(panel);
  this.pack();
  this.setLocationRelativeTo(null);
  this.setVisible(true);
 }  
}
