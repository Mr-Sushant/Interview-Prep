import java.util.*;
public class sort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers in array");
		int a[]=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Original");
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Sorted");
		for(int i=0;i<9;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<10;i++)
			System.out.print(a[i]+" ");
	}
}