/**
 * Write a description of class Hebbian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hebbian  
{
    // instance variables - replace the example below with your own
    private int x;
    double[][] weights = {{1,1},{0,0}};
    double[][] previousWeights = {{1,1},{0,0}};
    int value = 0;
    

    /**
     * Constructor for objects of class Hebbian
     */
    public Hebbian()
    {
    }
    
    
    public int activate(Girl g, RedOgre r, MusicPlayer m){
        int sum = 0;
        
        for(int i=0; i<weights.length; i++){
           sum += MyWorld.r1.isVisible() * weights[0][i] + MyWorld.m1.isOn() * weights[1][i]; 
        }   
        value = stepFunction(sum - 0.5);
        MyWorld.g1.changeStatusRun(value);
        //g.changeStatusScream(stepFunction(sum - 0.5));
        return stepFunction(sum);
       
    }
    
    public void train(){
        double weightChange = 0;
        double forgettingFactor = 0.05;
        double learningRate = 0.1;
        double lambda = learningRate / forgettingFactor;
        
        for(int i=0; i<weights[1].length; i++){
           weightChange = forgettingFactor * value * (lambda * MyWorld.m1.isOn() - weights[1][i]);
           weights[1][i] = weights[1][i] + weightChange;
        }        
    }
    
    public static int stepFunction(double x){
        if(x > 0)
            return 1;
        else
            return 0;
    }
}
