package SEE;
import package.CIE.*;
import java.util.*;
public class External extends Student
{
	int m[]=new int [5];
	int final[]=new int[5];
	public void getdata()
	{
		
		Scanner se=new Scanner(System.in);
		System.out.println("Enter see marks in 5 subjects");
		int j;
		for(j=0;j<5;j++)
		{
			m[j]=se.nextInt();
		}
	}
	public void display()
	{
		super.display();
		int k;
		for(k=0;k<5;k+=)
		{
			final[k]=cie[k]+see[k];
			System.out.println("Final marks in subject " +(k+1))
			System.out.println(final[k]);
		}
	}
}
