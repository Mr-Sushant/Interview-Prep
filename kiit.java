import java.util.*;
abstract class student
{
	int roll,reg;
	abstract void course();
}
class kiitian extends student
{
	void course()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details");
		roll=sc.nextInt();
		reg=sc.nextInt();
		System.out.println("Roll and Reg No is "+roll+" "+reg);
	}
}
public class kiit
{
	public static void main(String args[])
	{
		kiitian ob=new kiitian();
		ob.course();
	}
}