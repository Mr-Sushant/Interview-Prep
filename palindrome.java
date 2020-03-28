import java.util.*;
public class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int m=n;
		int r=0,s=0;
		while(m!=0)
		{
			r=m%10;
			s=s*10+r;
			m/=10;
		}
		if(n==s)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}
}