/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drawsmiley2;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
/**
 *
 * @author rkaune
 */
public class DrawSmiley extends JPanel
{
    Random rand = new Random(); 
   public void paintComponent(Graphics g)
   {
      
      super.paintComponent(g);
      
      // draw the face
      Color colorRandom = randomColor();
      g.setColor(randomColor());
      g.fillOval(30, 30, 250, 250);
      
      // draw the eyes
      g.setColor (randomColor());
      g.fillOval(55, 60, 200, 200);
      //g.fillOval(135, 65, 30, 30);
      
      // draw the mouth
      g.setColor (randomColor());
      g.fillOval(80, 85, 150, 150);
      
      g.setColor(randomColor());
      g.fillOval(120, 110, 100, 100);
      
      // "touch up" the mouth into a smile
      //g.setColor(Color.YELLOW);
      //g.fillRect(50, 110, 120, 30);
      //g.fillOval(50, 120, 120, 40);
   } 
   
   public static Color randomColor(){
       Random rand = new Random (); 
       float r = rand.nextFloat();
       float g = rand.nextFloat();
       float b = rand.nextFloat(); 
       
       Color  randomColor = new Color(r,g,b); 
       
       return randomColor; 
   }
} // end class DrawSmiley