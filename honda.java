class B
{
	static{System.out.println("B static");}
		B()
		{
			System.out.println("B  default");}
}
class A extends B 
{
		static{System.out.println("A static");}
		A()
		{
			System.out.println("A default");}
}
class honda extends A
{
	static{System.out.println("static");}
	honda()
	{
		System.out.println("default");}
	int a;
	String b;
	
	public static void main(String args[])
	{

		{
					honda ob=new honda();
					System.out.println(ob.a);
					System.out.println(ob.b);
		}
	}
	
}