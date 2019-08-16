import java.util.*;
class Sort
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	int i,n,size,j,temp;
	System.out.println("Enter size of array");
	size=se.nextInt();
	int arr[]=new int[size];
	System.out.println("Entter elements of array");
	for(i=0;i<size;i++)
	{
		arr[i]=se.nextInt();
	}
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
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
	for(i=0;i<size;i++)
		System.out.println(arr[i]);
}
}
