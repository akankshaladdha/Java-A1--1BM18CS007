import java.util.*;
class Roots
{
public static void main(String args[])
{
	Scanner se =new Scanner(System.in);
	System.out.println("Enter values of a,b,c");
	int a=se.nextInt();
	int b=se.nextInt();
	int c=se.nextInt();
	int D=(b*b)-(4*a*c);
	if(D>0)
	{
		System.out.println("Roots are real and distinct");
		double root1=(-b+Math.sqrt(D))/(2*a);
		double root2=(-b-Math.sqrt(D))/(2*a);
		System.out.println("Root 1:  " + root1);
		System.out.println("Root 2:  " + root2);
	}
	else if(D<0)
	{
		System.out.println("Roots are imaginary");
	}
	else
	{
		System.out.println("roots are equal");
		double root1=-b/(2*a);
		System.out.println("Root 1 = Root 2 =   " + root1);
	}
}
}
