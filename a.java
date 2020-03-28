import java.util.*;
class a
{
	int b;
	a()
	{
		System.out.println("Base default");
	}
	a(int p)
	{
		b=p;
		System.out.println("Base parameter");
	}
}
class b extends a
{
	int c;
	b()
	{
		System.out.println("Sub Default");
	}
	b(int q)
	{
		c=q;
		System.out.println("Sub parameter");
		
	}
	public static void main()
	{
		b b1=new b(3);
	}
}
	