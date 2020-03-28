/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class abcd{
    public void count(int a[],int n)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                count++;
            }
            if(count>n)
            {
                System.out.println(a[i]);
                return;
            }
        }
        System.out.println("-1");
    }
	public static void main(String[] args) {
		int t,n;
		abcd ob=new abcd();
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		if(t>=1&&t<=100)
		{
		for(int i=1;i<=t;i++)
		{
		    n=sc.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		    a[i]=sc.nextInt();
		    //for(int j=0;j<n;j++)
		    //System.out.println(a[i]);
		    ob.count(a,n);
		    
		}
		}
	}
}