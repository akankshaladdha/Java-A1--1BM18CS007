import java.util.*;
class Largest
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	int size,n,i;
	System.out.println("Enter size of array");
	size=se.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter elements of array");
	for(i=0;i<size;i++)
	{
		arr[i]=se.nextInt();
	}
	int large=arr[0];
	for(i=1;i<size;i++)
	{
		if(arr[i]>large)
			large=arr[i];
	}
	int second_large=arr[0];
	for(i=1;i<size;i++)
	{
		if((arr[i]>second_large)&&(arr[i]!=large))
			second_large=arr[i];
	}
	System.out.println("Second largest element is :  " + second_large);
}
}
	
		
		