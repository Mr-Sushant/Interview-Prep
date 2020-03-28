class bike
{
	int sp=150;
	int sp1=90;
}
class honda extends bike
{
	int sp=150;
	int sp1=90;
	public static void main(String args[])
	{
		bike ob=new honda();
		System.out.println(ob.sp);
		System.out.println(ob.sp1);
	}
}