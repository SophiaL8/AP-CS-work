
import processing.core.*;
import java.util.*;

public class DotsRun extends PApplet
{
int gameState = 1;
float playerX = 275;
float playerY = 500;
float playerWidth = 50;
float playerHeight = 50;
int score = 0;

public void settings(){
  size(600,600);
}

public void setup(){
    dots = new ArrayList<Dots>();
      for(int i = 0; i<10; i++){
        addDots();
  }
}

public void addDots(){
    float x = width/2;
    float y = height/2;
    float vx = random(-4, 3);
    float vy = random(-4, 3);
    float r = 10;
    int c = color(random(255), random(255), random(255));
    Dots b = new Dots(this, x, y, vx, vy, r, c);
    dots.add(b);
}

public void draw(){
  background(0);
  if(gameState == 1){
    Intro();
  }else if(gameState == 2){
    MainGame();
  }else if(gameState == 3){
    EndGame();
  }
   //for(int i= 0; i<10; i++){
     //goes through the list of balls and calls display for each one
    for(Dots dot: dots){
      dot.display();
      //calls collsionWithPlayer for each ball, detecting collision detection
      if(dot.collisionWithPlayer(playerX, playerY, playerWidth, playerHeight)){
      gameState = 3;
  }
    }
      }

public void Intro(){
  fill(255);
  textAlign(CENTER);
  textSize(25);
  text("Try to get to the end of the page \n without bumping into any of the dots\n Use the arrows on your keyboard to move the square \nPress the RETURN key to start", width/2, height/2);
}

public void MainGame(){
  background(0);
  fill(174, 225, 240);
  rect(0, 550, 1000, 1000);
  fill(255);
  //the x position, the y position, the width, the height
  rect(playerX,playerY, playerWidth,playerHeight);
  //if the up arrow is pressed, then the block moves up
  text(score, 300, 100);
if(keyPressed){
  if(keyCode == UP){
    playerY -= 4;
  }
  if(keyCode == RIGHT){
    playerX+= 4;
  }
  if(keyCode == LEFT){
    playerX-=4;
  }
  if(keyCode == DOWN){
    playerY += 4;
  }
}
if(playerY == 0){
  score ++;
  playerX = 275;
  playerY = 500;
}
}
  
public void EndGame(){
  background(0);
  textAlign(CENTER);
  textSize(30);
  text("Good game!", width/2, height/2);
  text("Your score was: " + score, width/2, height/2+50);
}

public void keyPressed(){
  if(key == ENTER){
    gameState++;
  }
  if(gameState > 3){
    gameState = 1;
      playerX = 300;
      playerY = 500;
      score = 0;
  }
}
public static void main(String [] args){
    PApplet.main("DotsRun");
}
private ArrayList<Dots> dots;
}