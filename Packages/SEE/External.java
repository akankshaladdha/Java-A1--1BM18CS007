package SEE;
import CIE.*;
import java.util.*;
public class External extends Student
{
	public int m[]=new int [5];
	int j,k;
	
	public void getdata()
	{
		
		Scanner se=new Scanner(System.in);
		System.out.println("Enter see marks in 5 subjects");
		
		for(j=0;j<5;j++)
		{
			m[j]=se.nextInt();
		}
	}
	public void display()
	{
		super.display();
		
		
	}
}
