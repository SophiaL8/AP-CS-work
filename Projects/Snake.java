import processing.core.*;
import java.util.*;
public class Snake{
 public Snake(PApplet p, PVector pos, PVector vel, float c){
    this.pos = pos.copy();
    this.vel = vel.copy();
    this.p = p;
    this.c = c;
 }

public void display(){
   p.fill(c);
    
    p.rect(pos.x, pos.y, 10, 10);
    
    //x = x+xspeed;
   // y = y+yspeed;
}
    
public void moveUp(){
    pos.add(0, -10);
}
public void moveDown(){
    pos.add(0, 10);
}

public void moveRight(){
    pos.add(10,0);
}

public void moveLeft(){
    pos.add(-10, 0);
}
private PVector pos;
private PVector vel;
private float xspeed;
private float yspeed;
private float c;
private PApplet p;
}