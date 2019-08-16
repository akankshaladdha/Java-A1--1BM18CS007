import java.util.*;
class Matrix
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	int rs1,rs2,cs1,cs2,i,j;
	System.out.println("Enter row size and col size of matrix A");
	rs1=se.nextInt();
	cs1=se.nextInt();
	int arr1[][]=new int[rs1][cs1];
	System.out.println("Enter row size and col size of matrix B");
	rs2=se.nextInt();
	cs2=se.nextInt();
	int arr2[][]=new int[rs2][cs2];
	int arr3[][]=new int[rs1][cs1];
	int arr4[][]=new int[rs1][cs1];
	System.out.println("Enter elements of matrix A");
	for(i=0;i<rs1;i++)
	{
		for(j=0;j<cs1;j++)
		{
			arr1[i][j]=se.nextInt();
		}
	}
	System.out.println("Enter elements of matrix B");
	for(i=0;i<rs2;i++)
	{
		for(j=0;j<cs2;j++)
		{
			arr2[i][j]=se.nextInt();
		}
	}
	if((rs1==rs2)&&(cs1==cs2))
	{
		for(i=0;i<rs1;i++)
		{
			for(j=0;j<cs1;j++)
			{
				 arr3[i][j] = (arr1[i][j]) + (arr2[i][j]);
				 arr4[i][j] = (arr1[i][j]) - (arr2[i][j]);
			}
		}
	
	System.out.println("Matrix after adding elements");
	for(i=0;i<rs1;i++)
	{
		for(j=0;j<cs1;j++)
		{
			System.out.print(arr3[i][j] + " ");
		}
		System.out.print("\n");
	}
	System.out.println("Matrix after subtracting elements");
	for(i=0;i<rs1;i++)
	{
		for(j=0;j<cs1;j++)
		{
			System.out.print(arr4[i][j] + " ");
		}
		System.out.print("\n");
	}
	}
	else
	{
		System.out.println("Operation cant be performed");
	}
}
}
	
