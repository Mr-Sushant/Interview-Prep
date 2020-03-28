import java.util.*;
public class compute
{
	public static void main(String args[])
	{
		box ob=new box();
		ob.input();
		ob.volume();
	}
}
class box
{
	int l,b,h;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
	}
	void volume()
	{
		int v=l*b*h;
		System.out.println("Volume is "+v);
	}
}