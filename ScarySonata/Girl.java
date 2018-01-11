import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Girl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Girl extends Actor
{
    //variables
    int run = 0;
    int direction = 5;
    /**
     * Act - do whatever the Girl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //turn(1);
        if (run==1){
            setImage("scaredgirl.png");
        // checking edges  
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction;  
        // movement  
        move(direction);
            //turn(90);
        }
        else{
            setImage("happygirl.png");
        }
    }
    
    public void makeRun(){
        run = 1;
    }
    
    public void stopRun(){
        run = 0;
    }
    
    public int getRun(){
        return run;
    }    

    public void changeStatusRun(int x){
        if(x == 0)
            stopRun();
        else if(x==1)
            makeRun();
    } 
    

}
