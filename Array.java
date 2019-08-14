import java.util.*;

class Array

{
    
	public static void main(String args[])
    
{
       Scanner se=new Scanner(System.in);
        
	int size,n,i;
        
	System.out.println("Enter size of array");
        
	size=se.nextInt();
        
	int arr[] = new int[size];
        
	System.out.println("Enter elements of array");
        
	int sum=0;
        
	for(i=0;i<size;i++)
        
	{
            
		arr[i]=se.nextInt();
            
		sum+=arr[i];
        
	}
        
	System.out.println("Sum of elements is :  "+ sum);
        
        
   
}

}