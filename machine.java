import java.util.*;
interface motor
{
	int capacity=10;
	public void run();
	public void consume();
}
class Washing implements motor
{
	public void run()
	{
		while(true)
		{
			int x=sc.nextInt();
			if(x==capacity)
				consume();
		}
//capacity=sc.nextInt();
	}
	public void consume()
	{
		System.out.println("The value of capacity is full "+capacity);
	}
}
public class machine
{
	public static void main(String args[])
	{
		Washing ob=new Washing();
		ob.run();
		ob.consume();
	}
}