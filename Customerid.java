import java.util.*;

class Customer

{
	
	private int cust_id,quan;
	
	String name;
	
	double price,discount,totalp,net_price;

		
	void get_data()
	
	{
		
		Scanner se=new Scanner(System.in);
		
		System.out.println("Enter cust id");
		
		cust_id=se.nextInt();
		
		System.out.println("Enter quantity");
		
		quan=se.nextInt();
		
		System.out.println("Enter name");
		
		name=se.next();
		
		System.out.println("Enter price");
		
		price=se.nextDouble();
		
	
	}
	
	void cal_discount()
	
	{
		
		totalp=price*quan;
		
		if(totalp>=50000)
		
		{
			
			discount=(0.25)*totalp;
		
		}
		
		if(totalp>=25000)
		
		{
			
			discount=(0.10)*totalp;
		
		}
		
		net_price=totalp-discount;
	
		}
	
		void output()
	
		{

			System.out.println("CUSTOMER ID:  "+cust_id);
		
			System.out.println("QUANTITY:  "+quan);
		
			System.out.println("NAME:  "+name);
		
			System.out.println("PRICE:  "+price);
		
			cal_discount();
		
			System.out.println("DISCOUNT:  "+discount);
		
			System.out.println("TOTAL PRICE:  "+totalp);
		
			System.out.println("NET PRICE:  "+net_price);
	
		}


}

class Customerid

{
	
	public static void main(String args[])

{
	
	Scanner se=new Scanner(System.in);
	
	System.out.println("Enter no of Customer");
	
	int n=se.nextInt();
	
	Customer c[]=new Customer[n];
	
	int i;
	
	for(i=0;i<n;i++)
	
	{
		
		c[i]=new Customer();
	
	}
	
	for(i=0;i<n;i++)
	
	{
	
		c[i].get_data();
		
		c[i].cal_discount();

		System.out.println("***************Details of Customer : "+ (i+1)+" are************");		
		c[i].output();

		System.out.println("***************************");	
	}

}

}

