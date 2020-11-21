//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)
import java.util.Scanner;
public class Shape {
private String color;
private boolean filled;
Shape()
{
   this.color="green";
   this.filled=true;
}
Shape(String color,boolean filled)
{
   this.color=color;
   this.filled=filled;
}
String getColor()
{
	return color;
}
void setColor(String color)
{
	this.color=color;
}
boolean isFilled()
{
	Scanner input=new Scanner(System.in);
	System.out.println("Is Shape Filled: (true/false): ");
	return filled=input.nextBoolean();
}
void setFilled(boolean filled)
{
	this.filled=filled;
}
public String toString()
{
	 String Fill=" ";
     if(isFilled() == true)
     {
    	 Fill = "is Filled";
     }
     else
     {
    	 Fill = "is not Filled";
     }
	return "A shape with colour of "+color+" and "+ Fill+"\n";
}
}
