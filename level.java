import java.util.*;
class plate
{
	int l,b;
	plate(int len,int wid)
	{
		System.out.println("plate");
		l=len;
		b=wid;
	}
}
class box extends plate
{
	int h;
	box(int len,int wid,int hei)
	{
		
		super(len,wid);
		System.out.println("box");
		h=hei;
	}
}
class woodBox extends box
{
	int t;
	woodBox(int len,int wid,int hei,int thi)
	{
		
		super(len,wid,hei);
		System.out.println("woodBox");
		t=thi;
	}
}
public class level
{
	public static void main(String args[])
	{
		woodBox ob=new woodBox(1,2,3,4);
	}
}
	