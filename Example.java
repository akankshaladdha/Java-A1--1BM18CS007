import java.util.*;
class Vehicle
{
	String model,color;
	int year;
	static int no;
	Vehicle(String model,String color,int year)
	{
		this.model=model;
		this.color=color;
		this.year=year;
		no ++;
	}
	void output()
	{
		System.out.println("Model:  "+model);
		System.out.println("Color:  "+color);
		System.out.println("Year:  "+year);
	}
	static void out()
	{
		System.out.println("Tootal: "+no);
	}
}
class Example
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter no of vehicles");
	int n=se.nextInt();
	Vehicle arr[]=new Vehicle[n];
	int i;
	for(i=0;i<n;i++)
	{
		System.out.println("Enter model,color and year of vehicle:  "+(i+1));
		String m=se.next();
		String c=se.next();
		int y=se.nextInt();
		 arr[i]=new Vehicle(m,c,y);
	}
	for(i=0;i<n;i++)
	{
		System.out.println("****Details of Vehicle:  "+(i+1)+"****");
		arr[i].output();
	}
	Vehicle.out();
}
}
	
	
