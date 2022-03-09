

 class Fan {

 int speed;
 boolean on; 
 double radius; 
 String color;
final static int OFF=0, SLOW=1, MEDIUM=2, FAST=3;
    public Fan(int spd, boolean onn, double radiuss, String colorr) {
    	speed=spd;
    	on=onn;
    	radius=radiuss;
    	color=colorr;
    }
    //ACCESSOR
   public int getSpeed()
    {
    	return speed;
    }
    public boolean getOn()
    {
    	return on;
    }
    public double getRadius()
    {
    	return radius;
    }
    public String getColor()
    {
    	return color;
    }
    //MUTATOR
    public void setSpeed(int spd)
    {
    	 speed=spd;
    }
    public void setOn(boolean onn)
    {
    	 on=onn;
    }
    public void setRadius(double r)
    {
    	radius=r;
    }
    public String toString()
    {
    	return "Fan speed: "+speed+" On: "+on+"Color: "+color+" Radius: "+radius;
    }
    
 }
 
 public class FanTest
 {
 	public static void main(String args[])
 	{
 		Fan fan = new Fan(Fan.OFF,false, 43.2, "black");
 		fan.setOn(true);
 		fan.setSpeed(Fan.FAST);
 		System.out.println(fan);
 		
 	}
 }
 
 