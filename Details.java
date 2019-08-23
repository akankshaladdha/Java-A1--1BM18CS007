import java.util.*;
class Employee
{
	String employee_number,name;
	double basic,DA,IT,net_salary;
	void get_data()
	{
			
			Scanner se=new Scanner(System.in);
			System.out.println("Employee Number");
			employee_number=se.next();
			System.out.println("Employee Name");
			name=se.next();
			System.out.println("Basic Salary");
			basic=se.nextDouble();
			System.out.println("DA Salary");
			DA=se.nextDouble();
			System.out.println("IT Salary");
			IT=se.nextDouble();
	
	}
	 void cal_salary()
	{
		DA=(0.75)*basic;
		IT=(0.30)*(basic+DA);
		net_salary=basic + DA - IT;
	}
	 void print()
	{
			
			System.out.println("EMPLOYEE NUMBER:  "+employee_number);
			System.out.println("EMPLOYEE NAME:  "+name);
			System.out.println("BASIC SALARY:  "+basic);
			System.out.println("DA SALARY:  "+DA);
			System.out.println("IT SALARY:  "+IT);
			System.out.println("NET SALARY:  "+net_salary);
			
	}
}
class Details
{
	public static void main(String args[])
{

	Scanner se=new Scanner(System.in);
	Employee emp=new Employee ();
	System.out.println("Enter details of Employee");
	emp.get_data();
	System.out.println("******DETAILS of EMPLOYEE  "+"******");
	emp.cal_salary();
	emp.print();
	
}
}
	
			