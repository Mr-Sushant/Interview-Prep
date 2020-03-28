import java.util.*;
class Address
{
	String city,state;int pinno;
void setAddress()
{
	System.out.println("Enter");
	city=sc.next();
	state=sc.next();
	pinno=sc.nextInt();
}
void getAddress()
{
	System.out.println("CITY "+city);
	System.out.println("STATE "+state);
	System.out.println("PIN "+pinno);
}
}
class HomeAddress
{
	String plotno;
	setAddress()
	{
		System.out.println("Enter plot no");
		plotno=sc.next();
	}
	getAddress()
	{
		System.out.println("PLOT NO "+plotno);
	}
}
class OfficeAddress
{
	String offPlot;
	setAddress()
	{
		System.out.println("Enter plot no");
		offPlot=sc.next();
	}
	