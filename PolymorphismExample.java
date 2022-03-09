abstract class Shape
{
	
String color;
public String getColor() { return color; }
abstract public double area();

}

class Circle extends Shape 
{

double radius;
public Circle(String color, double rad){
super.color=color;
radius = rad;
}

public double area() { return 3.14*radius*radius; }

}

class Rectangle extends Shape 
{

double length, breadth;
public Rectangle(String color, double len, double brd){
super.color=color;
length = len;
breadth = brd;
}

public double area() { return length * breadth; }

}

public class PolymorphismExample
{
public static void main(String args[])
{
	Shape s;
	s = new Circle("red", 14.0);
	System.out.println("Area of circle : " + s.area());//dynamic binding
	s= new Rectangle("green", 10.0,30.0);
	System.out.println("Area of rectangle : " + s.area());
}
}
