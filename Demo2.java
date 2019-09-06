import java.util.*;
class  Account
{
	String name;
	int id;
	double balance;
	void get_data()
	{
		Scanner se= new Scanner(System.in);
		System.out.println("Enter Name");
		 name=se.next();
		System.out.println("Enter id");
		 id=se.nextInt();
		System.out.println("Enter Balance");
		 balance=se.nextDouble();
	}
	void display()
	{
		System.out.println("Details are");
		System.out.println("Name:  "+name);
		System.out.println("ID:  "+id);
		System.out.println("Balance:  "+balance);
	}
}
class Saving extends Account
{
	int time;
	float rate;
	void input()
	{
		get_data();
		Scanner se= new Scanner(System.in);
		System.out.println("Enter time");
		 time=se.nextInt();
		System.out.println("Enter rate");
		 rate=se.nextFloat();
	}
	double compute()
	{
		return (balance*time*rate);
	}
	void output()
	{
		display();
		
		System.out.println("Interest is :   "+compute());
	}
}
class Demo2
{
	public static void main(String args[])
{
	Saving a=new Saving();
	a.input();
	a.output();
}
}
