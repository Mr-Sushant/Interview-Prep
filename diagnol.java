import java.util.*;
public class diagnol
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int left=0,right=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					right+=a[i][j];
				}
				else if(i+j==2)
				{
					left+=a[i][j];
				}
			}
		}
		System.out.println("Right Diagonal Sum is "+right);
		System.out.println("Left Diagonal Sum is "+left);
	}
}