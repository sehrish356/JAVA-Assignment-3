

//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)

import java.util.Scanner;
public class TestShape {
public static void main(String args[])
{
	int ch;
	do 
	{
		
		Scanner input=new Scanner(System.in);
		System.out.println("1. For Shape Data");
		System.out.println("2. For Circle Data");
		System.out.println("3. For Rectangle Data");
		System.out.println("4. For Square Data");
		System.out.println("5. For UserInput Shape1 Data");
		System.out.println("6. For UserInput Circle Data");
		
		System.out.println("Enter Your Choice");
		ch=input.nextInt();
		switch(ch)
		{
		case 1:{
			Shape sh=new Shape("red",true);
			System.out.println(sh);
			break;
		}
		case 2:{
			Circle cr=new Circle(3,"Pink",true);
			System.out.println(cr);
			double a=cr.getArea();
			double b=cr.getParimeter();
			System.out.println("Area: "+a);
			System.out.println("Parimeter: "+b);
			break;
		}
		case 3:{
			Rectangle rec=new Rectangle(4.0,6.0,"Purple",false);
			System.out.println(rec);
			double a=rec.getArea();
			double b=rec.getPerimeter();
			System.out.println("Area: "+a);
			System.out.println("Parimeter: "+b);
			break;
		}
		case 4:{
			Square sq=new Square(4.0,"golden",true);
			System.out.println(sq);
			double a=sq.getArea();
			double b=sq.getPerimeter();
			System.out.println("Area: "+a);
			System.out.println("Parimeter: "+b);
			break;
		}
		case 5:{
			Scanner input1=new Scanner(System.in);
			System.out.println("Enter color");
			String cl=input1.nextLine();
			Shape sh=new Shape();
			sh.setColor(cl);
			System.out.println(sh);
			break;
		}
		case 6:{
			Scanner input1=new Scanner(System.in);
			System.out.println("Enter Radius");
			double r=input1.nextDouble();
			System.out.println("Enter color");
			String cl=input1.nextLine();
			Circle cr=new Circle();
			cr.setColor(cl);
			cr.setRadius(r);
			System.out.println(cr);
			break;
		}
		}
	}while(ch!=0);
}
}
