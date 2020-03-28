import java.util.*;
class a
{
	a(int z)
	{
		
		System.out.println("Base parameter");
	}
}
class b extends a
{
	int c;
	b(int q,int p)
	{
		super(p);
		c=q;
		System.out.println("Sub parameter");
		
	}
	public static void main(String args[])
	{
		b b1=new b(3,4);
	}
}
	