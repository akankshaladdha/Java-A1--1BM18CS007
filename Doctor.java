import java.util.*;
class Patient
{
	String patient_name,doctor_name;
	int patient_id,age;
	void input()
	{
		Scanner se=new Scanner (System.in);
		System.out.println("Enter name of patient");
		patient_name=se.next();
		System.out.println("Enter patient id");
		patient_id=se.nextInt();
		System.out.println("Enter age of patient");
		age=se.nextInt();
		System.out.println("Enter name of doctor");
		doctor_name=se.next();
	}
	void output()
	{
		System.out.println("Name:  "+patient_name);
		System.out.println("ID :  "+patient_id);
		System.out.println("Age:  "+age);
		System.out.println("Doctor:  "+doctor_name);
	}
}
class Doctor
{
	public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
	System.out.println("Enter no of Patient");
	int n=se.nextInt();
	Patient p[]=new Patient[n];
	int i;
	for(i=0;i<n;i++)
	{
		p[i]=new Patient();
	}
	
	for(i=0;i<n;i++)
	{
		p[i].input();
		System.out.println("********** Details of Patient:   "+(i+1)+"  *********");
		p[i].output();
		System.out.println(" ************************************ ");
	}
	System.out.println("Enter doctor name");
	String doc=se.next();
	for(i=0;i<n;i++)
	{
		if(doc.equals(p[i].doctor_name))
			System.out.println("Patient " + (i+1)+":  " +p[i].patient_name);
		else
			System.out.println("Patient " + (i+1)+": Not Found");
				
	}
}
}
	