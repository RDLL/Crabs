import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiempo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiempo extends Actor
{
    private SimpleTimer timer;
    private Counter contador;
    /**
     * Act - do whatever the Tiempo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Se ejecuta al momento de crear al objeto
    public Tiempo()
    {
        timer = new SimpleTimer();
        contador = new Counter("Tiempo: ");
        contador.setValue(30);
    }
    
    //Se ejecuta al momento de agregar el objeto en el mundo
    protected void addedToWorld(World world)
    {
        world.addObject(contador, 60, 20);
    }
    
    public void act() 
    {
        // Add your action code here.
        if(timer.millisElapsed() > 1000)
        {
            System.out.println(timer.millisElapsed());
            contador.setValue(contador.getValue() - 1);
            if(contador.getValue() == 0)
            {
                Greenfoot.stop();
            }
            timer.mark();
        }
    }    
}
