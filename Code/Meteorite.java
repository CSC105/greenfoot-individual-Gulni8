import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meteorite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteorite extends Actor
{
    /**
     * Act - do whatever the meteorite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
       public Meteorite (){ 
        GreenfootImage myImage = getImage();
        int myNewHeight=(int) myImage.getHeight()/6;
        int myNewWidth =(int) myImage.getWidth()/6;
        myImage.scale(myNewHeight,myNewWidth);
    }

    public void act() 
    {
        // Add your action code here.
    }    
}
