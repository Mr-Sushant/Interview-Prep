import java.util.*;
class ReservationSystem
{
	Scanner sc=new Scanner(System.in);
	int ar[];
	int n=10;
	ReservationSystem()
	{
		n=10;
		int ar[]=new int[n];
	}
	public void initial()
	{
		//System.out.println("Enter Seating Capacity");
		//n=sc.nextInt();
		n=10;
		ar=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=0;
	}
	public int assign(int l,int s,int j)
	{
		String c;
		int i=l;
		for(i=l;ar[i]!=0;i++)
		{
			if(i==9)
				break;
		}
		
		if(i==s-1)
		{
			if(j==1)
			{
				System.out.println("Do you want to sit in Non Smoking area ?");
				c=sc.next();
				if(c.equals("y"))
					assign(6,10,1);
				else{
				System.out.println("Next flight leaves in 3 hours");return -99;}
			
			}
		}
		if(i==s-1)
		{
			if(j==2)
			{
				System.out.println("Do you want to sit in Smoking area ?");
				c=sc.next();
				if(c.equals("y"))
					assign(6,10,2);
				else
					System.out.println("Next flight leaves in 3 hours");
			}
		}
		if(i==10)
		{
			System.out.println("Sorry Fligt is full");
			return 0;
		}
		else{ar[i]=1;
		return i;}
	}
}
class AirlineReservationSystem extends ReservationSystem
{
	public void book()
	{
		int seat;
		for(int i=0;i<8;i++)
		{
		System.out.println("Enter 1 for Smoking 2 for Non Smoking");
		int m=sc.nextInt();
		if(m==1){
			seat=assign(0,5,1);
			if(seat>0)
			System.out.println("Seat no "+seat+" is booked");}
		else{
			seat=assign(6,10,2);
			if(seat>0)
			System.out.println("Seat no "+seat+" is booked");}
		}
	}
	public static void main(String args[])
	{
		AirlineReservationSystem ob=new AirlineReservationSystem();
		ob.initial();
		ob.book();
	}
}
		
