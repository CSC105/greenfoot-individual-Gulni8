import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Actor
{
    private int x,y;
    private GreenfootImage[] images = new GreenfootImage[36];
    private GreenfootImage img = new GreenfootImage("Flamingo1.png");
    public static final int Gravity = 1;
    public static final int Speed = 8;
    public static final int FlySpeed = -5;
    private double VerticalSpeed = 0;
    private int score = 0;

    private int imgNum =1;
    
    
  public Flamingo(int x,int y)
    {
        for(int i=1;i<images.length;i++){
            images[i] = new GreenfootImage("Flamingo"+i+".png");
            images[i].scale(40,72);
            setImage(images[imgNum]);
        }
        this.x=x;
        this.y=y;
        setLocation(x,y);
        
        VerticalSpeed = 0;
        score = 0;
    }
    
    public void act() 
    {
    checkFly();
    move();
    animateFly();
        if (checkHit()) {
            Space space = (Space) getWorld();
            space.gameOver(score);
        } else {
            // Checks if the bird gets ths score.
            checkScore();
        }
}


private void checkFly() {
        if (Greenfoot.isKeyDown("up")) {
            VerticalSpeed = FlySpeed-(VerticalSpeed/2);
            Greenfoot.playSound("jump_04.wav");
        }
    }   
    
    public void animateFly()
{ 
    imgNum = (imgNum+1) % images.length;
    setImage(images[imgNum]);
  
} 

private void move() {
      VerticalSpeed = VerticalSpeed + Gravity;
        setLocation(getX(), getY() +(int) VerticalSpeed);
        
    }

private boolean checkHit() {
        if (isTouching(Spacepipe.class)) {
            return true;
        }
        if (getY() == getWorld().getHeight() - 1) {
            return true;
        }
        return false;
    }
    
private void checkScore() {
        if (isTouching(ScoreL.class)) {
            removeTouching(ScoreL.class);
            score++;
            Space space  = (Space) getWorld();
            space.setScore(score);
        }
    }
}

