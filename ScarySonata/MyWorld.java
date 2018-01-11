import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Girl g1;
    static RedOgre r1;
    static MusicPlayer m1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(330, 250, 3); 
        r1 = new RedOgre();
         addObject(r1, 200, 50);
        m1= new MusicPlayer();
         addObject(m1 ,100, 150);
        g1 = new Girl();
        addObject(g1, 200, 200);
        Controller c = new Controller();
         addObject(c, 280, 65);
        c.initialize(g1,r1,m1);
        
    }
}
