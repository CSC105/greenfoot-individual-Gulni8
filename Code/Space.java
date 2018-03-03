import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    public static final int pipeSpacing = 170;
    public static final int pipe_Min_Height = 25;
    private final int pipe_Interval = 30;
    private int pipeTimer = 0;
    private ScoreBoard scoreBoard = null;
    
    //private int counter = 0;
    

    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
       
        super(640, 380, 1); 
        addObject(new Flamingo(30,64), 178,getHeight()/2);
        scoreBoard = new ScoreBoard();
        addObject(scoreBoard, 70, 50);
        pipeTimer = pipe_Interval * 2;
        setPaintOrder(GameOver.class, ScoreBoard.class, Flamingo.class, Spacepipe.class);
    }
    
    public void act()
    {
         addPipePairPeriodically();
    }
    
    
    public void gameOver(int score) 
    {
        addObject(new GameOver(score), getWidth() / 2, getHeight() / 2);
        Greenfoot.stop();
        addObject(new replay(), 620,55);
    }
    
     public void setScore(int score) 
     {
        scoreBoard.setScore(score);
    }
    
    private void addPipePairPeriodically() 
     {
        pipeTimer--;
        if (pipeTimer == 0) {
            addPipePair();
            pipeTimer = pipe_Interval;
        }
    }
    
     private void addPipePair() 
     {
        int pipeMaxHeight = getHeight() - pipeSpacing - pipe_Min_Height;
        int height1 = pipe_Min_Height + Greenfoot.getRandomNumber(pipeMaxHeight - pipe_Min_Height);
        int y1 = height1 / 2 - 1;
        int height2 = getHeight() - height1 - pipeSpacing;
        int y2 = getHeight() - height2 / 2 - 1;
        int y3 = height1 + pipeSpacing / 2 - 1;
        addObject(new Spacepipe(height1), getWidth() - 1, y1);
        addObject(new Spacepipe(height2), getWidth() - 1, y2);
        addObject(new ScoreL(), getWidth() - Spacepipe.WIDTH / 2, y3);
    } 
    
}

