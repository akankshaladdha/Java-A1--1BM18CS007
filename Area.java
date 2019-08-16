import java.util.*;
class Rectangle
{
	int length,breadth;
	void input()
	{
		Scanner se =new Scanner(System.in);
		 length=se.nextInt();
		breadth=se.nextInt();
	}
	int area()
	{
		return(length*breadth);
	}
	void print()
	{
		System.out.println("Length :  " + length);
		System.out.println("Breadth :  " + breadth);
		System.out.println(" Area is :  " + area());
	}
}
class Area
{
		
	public static void main(String args[])
{
	Rectangle r1=new Rectangle();
	Rectangle r2=new Rectangle();
	System.out.println("Enter length and breadth of Rectangle 1");
	r1.input();
	System.out.println("Details of Rectangle 1");
	r1.print();
	System.out.println("Enter length and breadth of Rectangle 2");
	r2.input();
	System.out.println("Details of Rectangle 2");
	r2.print();
}
}
	
