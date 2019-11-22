import java.util.*;
class Thread1 implements Runnable
{
	int arr[],temp;
	Thread t;
	Thread1(int a[])
	{
		t=new Thread(this,"Thread1");
		t.start();
		arr=new int[a.length];
		arr=a;
	}
	synchronized public void run()
	{
		int i,j;	
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}	
		System.out.println("Elements in ascending order are");
	for(i=0;i<arr.length;i++)
		System.out.println(arr[i]);		
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Ascending thread Caught");
			}
		
	}
}
class Thread2 implements Runnable
{
	int arr[],temp;
	Thread t;
	Thread2(int a[])
	{
		t=new Thread(this,"Thread2");
		t.start();
		arr=new int[a.length];
		arr=a;
	}
	synchronized public void run()
	{
		int i,j;
		
			for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}	
		System.out.println("Elements in descending order are");
	for(i=0;i<arr.length;i++)
		System.out.println(arr[i]);		
			
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Descending thread Caught");
		}
		}
	
}
class Threadsort
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter no of elements");
	int n=se.nextInt();
	int a[]=new int[n];
	int i;
	System.out.println("Elements are");
	for(i=0;i<n;i++)
		a[i]=se.nextInt();
	Thread1 t =new Thread1(a);
	Thread2 t1 =new Thread2(a);
}
}

/*
Enter no of elements
5
Elements are
2 8 1 9 4
Elements in ascending order are
1
2
4
8
9
Elements in descending order are
9
8
4
2
1
*/

