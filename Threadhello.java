import java.util.*;
class C1 implements Runnable
{
	Thread t;
	C2 ob2;
	
	C1()
	{
		t=new Thread(this,"T1");
		ob2=new C2();
		t.start();
	}
	public void run()
	{
		try
		{
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("C1 thread caught");
		}
			System.out.println("Hello World : 1");
		
	}
}
class C2 implements Runnable
{
	Thread t;
	C3 ob2;
	
	C2()
	{
		t=new Thread(this,"T2");
		ob2=new C3();
		t.start();
	}
	public void run()
	{
		try
		{
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("C2 thread caught");}
			System.out.println("Hello World : 2");
		
	}
}
class C3 implements Runnable
{
	Thread t;
	C4 ob2;
	
	C3()
	{
		t=new Thread(this,"T3");
		ob2=new C4();
		t.start();
	}
	public void run()
	{
		try
		{
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("C3 thread caught");}
			System.out.println("Hello World : 3");
		
	}
}
class C4 implements Runnable
{
	Thread t;
	C5 ob2;
	C4()
	{
		t=new Thread(this,"T4");
	
		ob2=new C5();
		t.start();
	}
	public void run()
	{
		try
		{
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("C4 thread caught");}
			System.out.println("Hello World : 4");
		
	}
}
class C5 implements Runnable
{
	Thread t;
	
	
	C5()
	{
		t=new Thread(this,"T5");
		
		t.start();
	}
	public void run()
	{
		
			System.out.println("Hello World : 5");
		
	}
}
class Threadhello
{
	public static void main(String args[])
{
	C1 ob=new C1();
}
}
