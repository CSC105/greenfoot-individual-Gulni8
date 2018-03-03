import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreL extends Actor
{
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage img= new GreenfootImage("meteorite1.png");
        img.scale(30,30);
        setImage(img);
        move();
    }    
    
    
    private void move()
    {
        setLocation(getX() - Flamingo.Speed, getY());
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }
}
