import java.util.*;
public class greatest
{
	int x;
	void f1(int p)
	{
		x=p;
	}
	void check(greatest y,greatest z)
	{
		if(x>y.x && x>z.x)
		System.out.println("Object 1 is greatest");
		else if(y.x>x && y.x>z.x)
		System.out.println("Object 2 is greatest");
		else
		System.out.println("Object 3 is greatest");
	}
	public static void main(String args[])
	{
		greatest ob1=new greatest();
		greatest ob2=new greatest();
		greatest ob3=new greatest();
		ob1.f1(1);
		ob2.f1(2);
		ob3.f1(3);
		ob1.check(ob2,ob3);
	}	
}