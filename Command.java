import java.util.*;
class Command
{
	public static void main(String args[])
{
	int i,large=0;
	for(i=0;i<args.length;i++)
	{
		
		if(Integer.parseInt(args[i])>large)
			large=Integer.parseInt(args[i]);
	}
	System.out.println("Largest element is :   " +large);
}
}
