import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{
    private Lobster lobster;
    private Crab crab;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld(int totalGusanos)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels
        super(560, 560, 1); 
        Tiempo tiempo = new Tiempo();
        this.addObject(tiempo, 60, 20);
        lobster = new Lobster();
        addObject(lobster,53,65);
        crab = new Crab();
        addObject(crab,227,476);
        prepare(totalGusanos);
    }

    public Lobster accedeLangosta()
    {
        return lobster;
    }
    
    public Crab accedeCangrejo()
    {
        return crab;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    private void prepare(int numGusanos)
    {
        for(int i = 0; i < numGusanos; i++) {
            Worm worm = new Worm();
            int x= Greenfoot.getRandomNumber(520)+20;
            int y = Greenfoot.getRandomNumber(520)+20;
            addObject(worm,x,y);
        }
    }
}
