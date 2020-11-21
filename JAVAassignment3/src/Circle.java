

//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)

import java.util.Scanner;
public class Circle extends Shape {
private double radius;
Circle()
{
	super();
	this.radius=1.0;
}
Circle(double radius)
{
	super();
	this.radius=radius;
}
Circle(double radius,String color,boolean filled)
{
	super (color, filled);
	this.radius=radius;
}
double getRadius()
{
	return radius;
}
void setRadius(double radius)
{
	this.radius=radius;
}
double getArea()
{
	return Math.PI*radius*radius;
}
double getParimeter()
{
	return 2*Math.PI*radius;
}
public String toString()
{
   return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
}
}
