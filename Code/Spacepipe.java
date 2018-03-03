import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spacepipe extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public static final int WIDTH = 100;
    
    
    public Spacepipe(int height) {
        GreenfootImage image = new GreenfootImage(WIDTH-25, height);
        image.setColor(Color.LIGHT_GRAY);
        image.fill();
        setImage(image);
    } 
        
    public void act() 
    {
        // Add your action code here.
        setLocation(getX() - Flamingo.Speed, getY());
        
    }    
}
