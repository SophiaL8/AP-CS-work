import processing.core.*;
import java.util.*;
public class SnakeGame extends PApplet
{
  //PVector pos= new PVector(275,500);
  //PVector vel = new PVector(10,10);
   float c = color(random(255), random(255), random(255));
   float foodx;
float foody;
int gameState = 1;
Snake s;

public void settings()
{
    size(600,600);
}
public void setup()
{
    frameRate(10);
 s = new Snake(this, new PVector(275,500), new PVector(10,10), c);
    s.addSegment(new PVector(275, 500));
    s.addSegment(new PVector(265, 500));
    s.addSegment(new PVector(255, 500));
    foodx = random(0, width - 10);
    foody = random(0, height - 10);
    
   // snake = new ArrayList<Snake>();
    //snake.add(s);
   // addSnake();
}
/*
public void addSnake(){
 float xspeed = 10;
 float yspeed = 10;
 float c = color(random(255), random(255), random(255));
 s = new Snake(this, x, y, xspeed, yspeed, c);
 //snake.add(s);
}
*/
public void draw()
{
background(0);
  if(gameState == 1){
    Intro();
  }else if(gameState == 2){
    MainGame();
  }else if(gameState == 3){
    EndGame();
  }

}

public void addDot(){
fill(random(0,255));
rect(foodx, foody, 7, 7);

}
public void Intro(){
fill(255);
text("This is the snake game!", width/2, height/2);
}

public void MainGame(){
background(128);
//fill(25, 25, 50);
//rect(random(600), random(600), 5, 5);
s.display();
if(s.getMainPosition().x == foodx && s.getMainPosition().y == foody){
foodx = random(0, width - 10);
foody = random(0, height - 10);
s.addSegment(new PVector(0, 0));
}else{
addDot();
}

}
public void EndGame(){
fill(255);
text("Game Over!", width/2, height/2);
}
public void keyPressed(){
if(gameState == 2){
    if(keyCode == UP)
{
    s.moveSegments();
    s.moveUp();
}else if(keyCode == DOWN){
    s.moveSegments();
    s.moveDown();
}else if(keyCode == RIGHT){
    s.moveSegments();
    s.moveRight();
}else if(keyCode == LEFT){
    s.moveSegments();
    s.moveLeft();
}
}
if(key == ENTER){
gameState ++;
}
}
public static void main(String[] args){
    PApplet.main("SnakeGame");
}
private ArrayList<Snake> snake;
}

