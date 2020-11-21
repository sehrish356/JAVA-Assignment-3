

//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)

import java.util.Scanner;
public class Square extends Rectangle {
 Square()
 {
     super();
     double side = 1.0;
 }
 Square(double side)
 {
     super(side, side);
     side =side;
 }
 Square(double side, String color, boolean filled)
 {
     super(side, side, color, filled);
     side =side;
 }

 double getSide()
 {
     return super.getWidth();
 }
void setSide(double side)
{
    super.setLength(side);
    super.setWidth(side);
}

double getArea()
{
    return getSide()*getSide();
}
double getPerimeter()
{
    return 4*getSide();
}  
/*void setLength(double side)
{
	super.setLength(side);
}
void setWidth(double side)
{
	super.setWidth(side);
}*/
public String toString()
{
    return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
}
}
