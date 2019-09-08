import java.util.*;
class Queue
{
	int rear,front,size;
	int arr[];
	Queue()
	{
		rear=-1;
		front=0;
	}
	Queue(int s)
	{
		rear=-1;
		front=0;
		size=s;
		Scanner se=new Scanner(System.in);
		arr=new int[size];
	}
	void insert(int element)
	{
		if(rear==size-1)
		{
			System.out.println("Queue overflow");
			return ;
		}
		else
		{
			rear=rear+1;
			arr[rear]=element;
		}
	}
	int del()
	{
		if(front>rear)
		{
			System.out.println("Queue underflow");
			return -9999 ;
		}
		else{
		int item;
		item=arr[front];
		front = front+1;
		return item;
		}
	}
	void display()
	{
		if(front>rear)
		{
			System.out.println("Queue is empty");
		}
		else{
		int i;
		System.out.println("Elements in queue are");
		for(i=front;i<=rear;i++)
		{
			System.out.println(arr[i]+"  ");
		}
		
		}
	}
}
class Queue1
{
	public static void main(String args[])
{	
	Scanner se=new Scanner(System.in);
	System.out.println("Enter size");
	int size=se.nextInt();
	int option;
	Queue q=new Queue(size);
	do
	{
		System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
		System.out.println("Enter option");
		option=se.nextInt();
		switch(option)
		{
			case 1: System.out.println("Enter no of elements to be inserted");
				int n=se.nextInt();
				int i;
				if(n>size)
					System.out.println("Queue overflow");
				else{
				for(i=0;i<n;i++)
				{	int s=se.nextInt();
					q.insert(s);
				}
				}
				break;
			case 2: int e=q.del();
				System.out.println("The del element is:  "+e);
				break;
			case 3: q.display();
				break;
			case 4: System.out.println("Invalid input");
		}
	}while(option !=4);
}
}
				
					
					