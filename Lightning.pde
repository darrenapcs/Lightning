int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;

void setup()
{
  size(300,300);
  strokeWeight(5);
  background(0);

}
void draw()
{
 stroke((int)(Math.random()*256));
 while(endX < 300)
 	endX = startX + (int)(Math.random*9);
}
void mousePressed()
{

}

