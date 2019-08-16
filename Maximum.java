import java.util.*;
class Maximum
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	int rs,cs,i,j;
	System.out.println("Enter row size and col size");
	rs=se.nextInt();
	cs=se.nextInt();
	int arr[][]=new int[rs][cs];
	System.out.println("Enter elements of array");
	for(i=0;i<rs;i++)
	{
		for(j=0;j<cs;j++)
		{
			arr[i][j]=se.nextInt();
		}
	}
	int large=arr[0][0];
	for(int a[]:arr)
	{
		for(int x:a)
		{
			if(x>large)
				large=x;
		}
	}
	System.out.println("Largest element is :  " + large);
}
}
