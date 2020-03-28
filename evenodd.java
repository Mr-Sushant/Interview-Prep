import java.util.*;
public class evenodd
{
	public static void main(String[] args)
	{
		int even=0,odd=0;
		for(int i=0;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("No of even are "+even);
		System.out.println("No of odd are "+odd);
	}
}