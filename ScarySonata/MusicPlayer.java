import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicPlayer extends Actor
{
    int on = 0;
    int count = 0;
    GreenfootSound music = new GreenfootSound("music.mp3");
    /**
     * Act - do whatever the MusicPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(on == 1){
            //need to reset the song before it ends or else the program throws an error;
            if (count > 1500) {
                music.stop();
                count = 0;
            }
            playSong();
            setImage("radio.png");
            count++;
        }
        else{ 
            stopSong();
            setImage("radio2.png");
        }
        
    }    
    
    public void turnOn(){
        on = 1;
    }
    
    public int isOn(){
        return on;
    }
    
    public void turnOff(){
        on = 0;
    } 
    
    public void changeOn(int x){
        if(x == 0)
            turnOff();
        else if(x==1)
            turnOn();
    }
    
    public void playSong(){
        music.play();
        on = 1;
    }
    public void stopSong(){
        music.pause();
        on = 0;
    }
    
   public void pauseSong(){
        music.pause();
        on = 1;
    }
}
