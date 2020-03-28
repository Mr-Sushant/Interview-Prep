import java.util.*;
public class box
{
	int i,j;
	void f(int x,int y)
	{
		i=x;
		j=y;
	}
	void f1(box x)
	{
		x.i=i+x.i;
		x.j=j+x.j;
	}
	void display()
	{
		System.out.println("i is"+i);
		System.out.println("j is"+j);
	}
	public static void main(String[] args)
	{
		box b1=new box();
		b1.f(1,2);
		box b2=new box();
		b2.f(3,4);
		b1.display();
		b2.display();
		b2.f1(b1);
		b1.display();
	}
}