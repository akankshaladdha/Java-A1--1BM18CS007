import java.util.*;
abstract class Shape
{
	int a,b;
	abstract void printarea();
}
class Rectangle extends Shape
	{
		Rectangle()
		{
			Scanner se=new Scanner(System.in);
			System.out.println("Enter length and breadth");
			a=se.nextInt();
			b=se.nextInt();
		}
		void printarea()
		{
			System.out.println("Area of Rectangle is :  "+(a*b));
		}
	}
class Triangle extends Shape
	{
		Triangle()
		{
			Scanner se=new Scanner(System.in);
			System.out.println("Enter base and height");
			a=se.nextInt();
			b=se.nextInt();
		}
		void printarea()
		{
			System.out.println("Area of Triangle is :  "+(0.5*a*b));
		}
	}
class Circle extends Shape
	{
		Circle()
		{
			Scanner se=new Scanner(System.in);
			System.out.println("Enter radius");
			a=se.nextInt();
			
		}
		void printarea()
		{
			System.out.println("Area of Circle is :  "+(3.141*a*a));
		}
	}
class AreaShape
{
	public static void main(String args[])
{
	
	Shape ref=null;
	int choice;
	System.out.println("1.Rectangle 2.Triangle 3.Circle");
	System.out.println("Enter choice");
	Scanner se=new Scanner(System.in);
	 choice =se.nextInt();
	while(choice!=-1)
	{
		
		switch(choice)
	{
		case 1: ref=new Rectangle();
			break;
		case 2: ref=new Triangle();
			break;
		case 3: ref=new Circle();
			break;
		default :System.out.println("Invalid input");
	}
	
	System.out.println("Enter choice");
	choice =se.nextInt();
	}
	
	
}
}

/*1.Rectangle 2.Triangle 3.Circle
Enter choice
1
Enter length and breadth
2 4
Area of Rectangle is :  8
Enter choice
2
Enter base and height
2 4
Area of Triangle is :  4.0
Enter choice
3
Enter radius
6
Area of Circle is :  113.076
Enter choice
-1
*/
