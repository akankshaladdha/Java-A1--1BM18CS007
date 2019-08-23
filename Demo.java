import java.util.*;
class Time
{
	int h,m,s,day;
	Time(int h,int m,int s)
	{
		this.h=h;
		this.m=m;
		this.s=s;
	}
	void current_time(int hh,int mm,int ss)
	{
		h=hh;
		m=mm;
		s=ss;
	}
	void advance(int a,int b,int c)
	{
		h=h+a;
		m=m+b;
		s=s+c;
		if(s>60)
		{
			
			m=m+(s/60);
			s=s%60;
		}
		if(m>60)
		{
			
			h=h+(m/60);
			m=m%60;
		}
		if(h>24)
		{
			
			int day=0+(h/24);
			h=h%24;
		}
		
	}
	void print()
	{
		System.out.println("Time is :  " +day+"d"+" "+h+ ":"+m +":"+s);
	} 	
}
class Demo
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter time");
	int hr=se.nextInt();
	int min=se.nextInt();
	int sec=se.nextInt();
	Time t=new Time(hr,min,sec);
	
	System.out.println("Enter 1 to Reset time , 2 for Advance time, 3 for Print ,-1 to Exit");
	System.out.println("Enter option");
	int option=se.nextInt();
	while(option!=-1)
	{
			switch(option)
			{
				case 1:	System.out.println("Enter time");
					int h1=se.nextInt();
					int m1=se.nextInt();
					int s1=se.nextInt();
					t.current_time(h1,m1,s1);
					break;
				case 2: System.out.println("Enter new time");
					int h2=se.nextInt();
					int m2=se.nextInt();
					int s2=se.nextInt();
					t.advance(h2,m2,s2);
					break;
				case 3: t.print();
					break;
				case 4: System.out.println("Invalid Option");
					break;
			}
			System.out.println("Enter option");
			option=se.nextInt();
	}
}
}
			
					


	
