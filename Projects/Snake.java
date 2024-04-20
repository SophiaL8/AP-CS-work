import processing.core.*;
import java.util.*;
public class Snake{
 public Snake(PApplet p, PVector pos, PVector vel, float c){
    this.pos = pos.copy();
    this.vel = vel.copy();
    this.p = p;
    this.c = c;
    this.segments = new ArrayList<PVector>();
 }

public void display(){
   p.fill(c);
    
    //p.rect(pos.x, pos.y, 10, 10);
    
    
    for(PVector segment: segments){
        p.rect(segment.x, segment.y, 10,10);
    }
    
    //x = x+xspeed;
   // y = y+yspeed;
}
public PVector getMainPosition(){
    return segments.get(0);
}
    /*
public PVector getSegY(){
    return segments.get(y);
}
*/
public void moveUp(){
    segments.get(0).add(0,-10);
}
public void moveDown(){
    segments.get(0).add(0, 10);
}

public void moveRight(){
    segments.get(0).add(10,0);
}

public void moveLeft(){
    segments.get(0).add(-10, 0);
}
public void addSegment(PVector segment){
    segments.add(segment.copy());
}
public void moveSegments(){
    for(int i = segments.size()-1; i>0; i--){
        segments.get(i).x = segments.get(i-1).x;
        segments.get(i).y = segments.get(i-1).y;
    }
}
private PVector pos;
private PVector vel;
private float xspeed;
private float yspeed;
private float c;
private PApplet p;
private ArrayList<PVector> segments;
}