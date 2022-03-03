package javaGUI;
import java.awt.*;
import javax.swing.*;

public class GraphicPanel extends JPanel{

 //Image image;
 
 GraphicPanel(){
  
  //image = new ImageIcon("sky.png").getImage();
  this.setPreferredSize(new Dimension(500,500));
 }
 
 public void paint(Graphics g) {
  
  Graphics2D g2D = (Graphics2D) g;    //creating object of graphics and casting it to 2d graphics
  
  
  //g2D.drawImage(image, 0, 0, null);   // drawing a image
  
  g2D.setPaint(Color.blue);           //setting the color
  g2D.setStroke(new BasicStroke(5));   //giving the stroke or thickness of line
  g2D.drawLine(0, 0, 500, 500);             //position of line (starting and ending)
  
  g2D.setPaint(Color.pink);
  g2D.drawRect(0, 0, 100, 200);   //drawing a rectangle
  g2D.fillRect(0, 0, 100, 200);  //filling a rectangle
  
  g2D.setPaint(Color.orange);
  g2D.drawOval(0, 0, 100, 100);  //drawing a circle/oval
  g2D.fillOval(0, 0, 100, 100);	//filling a circle/oval
  
  g2D.setPaint(Color.red);
  g2D.drawArc(0, 0, 100, 100, 0, 180);       //drawing an arc
  g2D.fillArc(0, 0, 100, 100, 0, 180);      //filling an arc
  g2D.setPaint(Color.white);
  g2D.fillArc(0, 0, 100, 100, 180, 180);
  
  int[] xPoints = {150,250,350};             //giving x coordinates of triangle
  int[] yPoints = {300,150,300};			//giving x coordinates of triangle
  g2D.setPaint(Color.yellow);
  g2D.drawPolygon(xPoints, yPoints, 3);     //drawing a polygon i.e a triangle since we gave only three coordinate
  g2D.fillPolygon(xPoints, yPoints, 3);      //filling a polygon
  
  g2D.setPaint(Color.magenta);
  g2D.setFont(new Font("Ink Free",Font.BOLD,50));   //setting font of text
  g2D.drawString("U R A WINNER! :D", 50, 50);    //writing text
 }
}