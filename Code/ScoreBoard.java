import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ScoreBoard() 
    {
        // Add your action code here.
         drawScore(0);
    } 
    
     public void setScore(int score) 
     {
        drawScore(score);
    }
    
    private void drawScore(int score) 
    {
        GreenfootImage text = new GreenfootImage("Score: " + score, 25, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage image = new GreenfootImage(text.getWidth() + 20, text.getHeight() + 20);
        image.setColor(Color.RED);
        image.fill();
        image.setColor(Color.RED);
        image.drawRect(0, 0, image.getWidth() - 1, image.getHeight() - 1);
        image.drawImage(text, 10, 10);
        setImage(image);
    }
}
