import java.util.*;
public class prime
{
	void check(int n)
	{
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not prime");
				break;
			}
		}
		if(i==n)
		System.out.println("Prime");
	}
	public static void main(String args[])
	{
		prime ob=new prime();
		ob.check(5);
	}
}