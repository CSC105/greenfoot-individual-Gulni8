import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowTP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowTP extends World
{

    /**
     * Constructor for objects of class HowTP.
     * 
     */
    public HowTP()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 380, 1); 
         addObject(new hwtp(), 305,getHeight()/2);
         addObject(new back(), 38,(int)(0.08*getHeight()));
    }
}
