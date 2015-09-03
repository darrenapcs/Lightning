import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;

public void setup()
{
  size(400,400);
  strokeWeight(5);
  background(0);

}
public void draw()
{
 
 background(0);
ellipse(mouseX, mouseY, 50, 50);
ellipse(mouseX, mouseY+30, 50, 50);
ellipse(mouseX, mouseY-30, 50, 50);
 while(endX < 400){
 	
 	endX = startX + (int)(Math.random()*9);
 	stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
    endY = startY + (int)(Math.random()*20-10);

    line(startX,startY,endX,endY);
    startX = endX;
    startY = endY;
     }


}
public void mousePressed()
{
startX = mouseX;
startY = mouseY;
endX = 0;
endY = 150;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
