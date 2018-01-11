import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controller extends Actor
{
   Girl g;
   RedOgre r;
   MusicPlayer m; 
    
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Hebbian h1 = new Hebbian();
    public void act() 
    {
        //activate
        h1.activate(g, r, m);
        //training stage
        h1.train();
    }    
    
    public void initialize(Girl g, RedOgre r, MusicPlayer m){
        this.g = g;
        this.r = r;
        this.m = m;
    }
    

}
