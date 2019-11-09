import java.util.*;
import java.io.*;
class Gen<T,E>
{
	T t;
	E e;
	Gen(T ob1,E ob2)
	{
		t=ob1;
		e=ob2;
	}
	void showtype()
	{
		System.out.println("Type of T is :   "+ t.getClass().getName());
		System.out.println("Type of E is :   "+ e.getClass().getName());
	}
	T getob()
	{
		return t;
	}
	E getob1()
	{
		return e;
	}
}
class Generics
{
	public static void main(String args[])
{
	Gen<Integer,String> obj = new Gen<Integer,String>(25,"Akanksha");
	obj.showtype();
	int v = obj.getob();
	System.out.println("Value of type T is:   "+ v);
	String s = obj.getob1();
	System.out.println("Value of type E is:   "+ s);
}
}
	
