import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedOgre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedOgre extends Actor
{
    int visible = 0;
    int direction = 1;
    /**
     * Act - do whatever the RedOgre wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(visible== 0){
            setImage("balloon1.png");
            if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) {
                direction = -direction;  
            }
            else if((direction < 0 && getY() == 0) || (direction > 0 && getY() == getWorld().getHeight()-1)) {
                direction = -direction;  
            }
            move(direction);
        
        }
        else{
            setImage("oni.png");    
            turn(5);
        }
    }  
    
    public void makeVisible(){
        visible = 1;
    }
    
    public int isVisible(){
        return visible;
    }
    
    public void makeInvisible(){
        visible = 0;
    } 
    
    //used in hebbian code
    public void changeVisibility(int x){
        if(x == 0)
            makeInvisible();
        else if(x==1)
            makeVisible();
    }  
    
}
