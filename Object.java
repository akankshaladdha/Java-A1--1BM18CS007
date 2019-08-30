import java.util.*;
class Book
{
	String name,author;
	int num_pages;
	double price;
	Book()
	{
		name=null;
		author=null;
		num_pages=0;
		price=0.0;
	}
	void set_data()
	{
		Scanner se=new Scanner(System.in);
		name=se.next();
		author=se.next();
		num_pages=se.nextInt();
		price=se.nextFloat();
	}
	public String toString()
	{
		String s=("NAME:  "+name+"\nAUTHOR:  "+author+"\nPAGES:  "+num_pages+"\nPRICE:  "+price);
		return s;
	}
	void get_data()
	{
		String e= toString();
		System.out.println(e);
	}
		
}
class Object
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	int i;
	System.out.print("Enter no of objects");
	int n=se.nextInt();
	Book b[]=new Book[n];
	for(i=0;i<n;i++)
	{
		b[i]=new Book();
	}
	for(i=0;i<n;i++)
	{
		System.out.println("Enter name,author,pages and price of book:  "+(i+1));
		b[i].set_data();
	}
	for(i=0;i<n;i++)
	{
		System.out.println("***Details of Book:   "+(i+1)+"****");
		b[i].get_data();
	}
}
}







/*
Enter no of objects2
Enter name,author,pages and price of book:  1
aku ash 12 23.8
Enter name,author,pages and price of book:  2
akuwe shy 45 67.8
***Details of Book:   1****
NAME:  aku
Author:  ash
Pages:  12
PRICE:  23.799999237060547
***Details of Book:   2****
NAME:  akuwe
Author:  shy
Pages:  45
PRICE:  67.80000305175781
*/
