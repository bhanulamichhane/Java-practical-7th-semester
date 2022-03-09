/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
public class MovablePoints 
{
 int x,y,xSpeed,ySpeed;
}
public  MovablePoint(int x, int y, int xSpeed, int ySpeed){
    this.x=x;
    this.y=y;
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
}
void moveUp()
{
    y=y-ySpeed;
    
}
void moveDown()
{
    y=y+ySpeed;
}
void moveLeft()
{
    x=x-xSpeed;
}
void moveRight
{
    x=x+xspeed;
}
 
public class MovableCircle implements Movable{
    int radius ;
    MovablePoint center;
    MovableCircle(int x, int y, int xspeed, int yspeed, int r)
    {
        radius=r;
        center.setX(x);
        center.setY(y);
    }
    void moveUp(){
        center.setY(center.getY()-1)
    }
    String tostring(){
        
    }
    
    public class Test{
       
    public static void main(String args[]) {
       MovablePoint p = new MovablePoint(20,30,5,6);
       P.moveup();
       System.out.println(P);
       MovableCircle c= new MovableCircle
    }
}
