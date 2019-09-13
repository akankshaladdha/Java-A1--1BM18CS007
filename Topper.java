import java.util.*;

abstract class Person

{
	String name,address;
	
	int age;
	
	void get_data()
	
	{
		
		Scanner se=new Scanner (System.in);
		
		System.out.println("Enter name");
		
		name=se.next();
		
		System.out.println("Enter address");
		
		address=se.next();
		
		System.out.println("Enter age");	
		
		age=se.nextInt();
	
	}
	abstract float cal_avg();

}

abstract class Student extends Person

{
	
	int roll_no,sem;
	
	void get_gata()
	
	{
		
		super.get_data();
		
		Scanner se=new Scanner (System.in);
		
		System.out.println("Enter roll_no");
		
		roll_no=se.nextInt();
		
		System.out.println("Enter sem");
		
		sem=se.nextInt();
	
	}

}

class Exam extends Student

{
	
	int marks1,marks2;
	
	float cal_avg()
	
	{
		
		Scanner se=new Scanner (System.in);
		
		System.out.println("Enter marks1 and marks 2");
		
		marks1=se.nextInt();
		
		marks2=se.nextInt();
		
		float avg=(float)(marks1 + marks2)/2;
		
		return avg;
	
	}

}

class Topper

{
	
	public static void main(String args[])

{
	
	Scanner se=new Scanner (System.in);
	
	int pos=0;
	
	Person ref;
	
	System.out.println("Enter no of students");
	
	int n=se.nextInt();
	
	float avg[]=new float[n];
	
	
	int i;
        
	Person p[]=new Exam[n]; 
	
	for(i=0;i<n;i++)
	
	{
		
		p[i]=new Exam();
	
	}
	
	float large=avg[0];
	
	for(i=0;i<n;i++)
	
	{
		
		System.out.println("Enter details of student : "+(i+1));
		
		
		
		ref=new Exam();
		
		ref.get_data();
		
		float a=ref.cal_avg();

		System.out.println("Average marks of Student : "+(i+1)+" is "+a);	
		avg[i]=a;
		
		if(avg[i]>large)
			
		{
				
			large=avg[i];
				
			pos=i+1;
			
		}
	
	}
	
	System.out.println("Topper of class is Student :  "+pos);

}

}
