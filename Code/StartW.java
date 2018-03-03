import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartW here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartW extends World
{

    /**
     * Constructor for objects of class StartW.
     * 
     */
    public StartW()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 380, 1);
         addObject(new Gamename(), 325,(int)(0.2*getHeight())); 
         addObject(new Meteorite(), 178,(int)(0.45*getHeight())); 
         addObject(new Meteorite(), 78,(int)(0.7*getHeight())); 
         addObject(new StartButton(), 344,(int)(0.45*getHeight())); 
         addObject(new HTP(), 348,(int)(0.7*getHeight()));
    }
}
