import java.util.*;
interface abc
{
	//int basic=10000;
	public void earnings();
	public void deductions();
	public void bonus();
}
abstract class manager implements abc
{
	int basic;
	Scanner sc=new Scanner(System.in);
	public void earnings()
	{
		basic=sc.nextInt();
		int earn=(int)(basic +0.8*basic + 0.15*basic);
		System.out.println("Earnings is "+earn);
	}
	public void deductions()
	{
		int deduc=(int)(0.12*basic);
				System.out.println("Deduction is "+deduc);
	}
}
class substaff extends manager
{
	
	public void bonus()
	{
		int bo=(int)(0.5*basic);
		System.out.println("Bonus is "+bo);
	}
}
public class exe
{
	public static void main(String args[])
	{
				substaff obj=new substaff();
		obj.earnings();
		obj.deductions();

		obj.bonus();
	}
}