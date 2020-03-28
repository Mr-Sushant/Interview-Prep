abstract class Student
{
	String name,add;
	int id,age;
	char grade;
	public abstract boolean isPassed(double grade);
}
class Grad extends Student
{
	public boolean isPassed(double grade)
	{
		boolean x=false;
		if(grade>80.0)
			return true;
		return x;
	}
}

class UnderGrad extends Student
{
	public boolean isPassed(double grade)
	{
		boolean x=false;
		if(grade >70.0)
			x=true;
		return x;
	}
}

public class exe1
{
	public static void main(String args[])
	{
		Grad ob1=new Grad();
		UnderGrad ob2=new UnderGrad();
		boolean gra=ob1.isPassed(90.0);
		if(gra)
			System.out.println("Graduate is passed");
		else
			System.out.println("Graduate is failed");
		boolean ugra=ob2.isPassed(69.9);
		if(ugra)
			System.out.println("UnderGraduate is passed");
		else
			System.out.println("UnderGraduate is failed");
		
	}
}