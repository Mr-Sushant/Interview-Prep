import java.util.*;
class figure
{
	int a,b;
	figure(int i,int j)
	{
		a=i;b=j;
	}
	void area()
	{
		System.out.println("Area undefined");
	}
}
class rectangle extends figure
{
	rectangle(int a,int b)
	{
		super(a,b);
	}
	void area()
	{
		System.out.println("Rect area is "+a*b);
	}
}
class triangle extends figure
{
	triangle(int a,int b)
	{
		super(a,b);
	}
	void area()
	{
		System.out.println("Tri area is "+0.5*a*b);
	}
}
public class Area
{
	public static void main(String args[])
	{
		figure f;
		rectangle r=new rectangle(5,2);
		triangle t=new triangle(10,5);
		f=r;
		f.area();
		f=t;
		f.area();
	}
}