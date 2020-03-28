import java.util.*;
class d2
{
	void cost(int l,int b)
	{
		int area=l*b;
		System.out.println("Cost is "+area*40);
	}
}
class d3 extends d2
{
	void cost(int l,int b,int h)
	{
		int vol=l*b*h;
		System.out.println("Cost is "+vol*60);
	}
}
public class Cost
{
	public static void main(String args[])
	{
		d3 e=new d3();
		e.cost(2,3);
		e.cost(2,3,1);
	}
}