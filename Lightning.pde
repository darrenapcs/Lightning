int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;

void setup()
{
  size(400,400);
  strokeWeight(5);
  background(0);

}
void draw()
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
void mousePressed()
{
startX = mouseX;
startY = mouseY;
endX = 0;
endY = 150;
}

