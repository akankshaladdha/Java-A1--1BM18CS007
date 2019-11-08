package CIE;
import java.util.*;

public class Student
{
	public String usn,name;
	public int sem;
	public void getdata()
	{
		Scanner se=new Scanner(System.in);
		
		usn=se.next();
		name=se.next();
		sem=se.nextInt();
	}
	public void display()
	{
		System.out.println("USN:  "+usn);
		System.out.println("Name:  "+name);
		System.out.println("Sem:  "+sem);
	}
}
