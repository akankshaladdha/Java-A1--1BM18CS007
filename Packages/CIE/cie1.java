package CIE;
import java.util.*;
public class Internals extends Student
{
	int arr[]=new int[5];
	public void getdata()
	{
		super.getdata();
		Scanner se=new Scanner(System.in);
		System.out.println("Enter cie marks in 5 subjects");
		int i;
		for(i=0;i<5;i++)
		{
			arr[i]=se.nextInt();
		}
	}
	public void display()
	{
		super.display();
	}
}

