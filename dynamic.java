import java.util.*;
class A
{
	void display()
	{
		System.out.println("A class Display");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("B class Display");
	}
}
class C extends A 
{
	void display()
	{
		System.out.println("C class Display");
	}
}
public class dynamic
{
	public static void main(String[] args)
	{
		A r;
		A a1=new A();
		B b1=new B();
		C c1=new C();
		r=a1;
		r.display();
		r=b1;
		r.display();
		r=c1;
		r.display();
	}
}
		