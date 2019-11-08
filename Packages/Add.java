import CIE.*;
import SEE.*;
import java.util.*;
class Add
{
	public static void main(String args[])
{
	int f[]=new int[5];
	Scanner se=new Scanner(System.in);
	System.out.println("Enter no of students");
	int n=se.nextInt();
	Internals in[]=new Internals[n];
	External en[]=new External[n];
	
	int j;
	for(j=0;j<n;j++)
	{
		System.out.println("Enter name,usn and sem of student "+(j+1));
		in[j]=new Internals();
		en[j]=new External();
		in[j].getdata();
		en[j].getdata();
	}
int l;
	for(l=0;l<n;l++)
	{
		System.out.println("Details of student " +(l+1));
		in[l].display();
		for(j=0;j<5;j++)
	{
	f[j]= in[l].arr[j] + en[l].m[j];
			System.out.println("Final marks in subject " +(j+1));
			System.out.println(f[j]);
	}
	}
	
}
}
	
	
