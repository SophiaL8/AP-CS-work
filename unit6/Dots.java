import processing.core.*;
public class Dots{
  
public Dots(PApplet p, float x, float y, float vx, float vy, float r, int c){
    this.x = x;
    this.y = y;
    this.vx = vx;
    this.vy = vy;
    this.r = 10;
    this.c = c;
    this.p = p;
  }
  
public void display(){
    p.fill(c);
    p.ellipse(x, y, r*2, r*2);
    
    x+= vx;
    y+= vy;
    
    if(x<r || x>p.width-r){
      vx = -vx;
    }
    
    if(y<r || y>p.height-100-r){
      vy = -vy;
    }
  }
  
boolean collisionWithPlayer(float playerX, float playerY, float playerWidth, float playerHeight){
    if(x<playerX + playerWidth &&
      x>playerX && y<playerY+playerHeight &&
      y>playerY){
        return true;
      }
      return false;
  }
private float x;
private float y;
private float vx;
private float vy;
private float r;
private int c;
private PApplet p;
}
