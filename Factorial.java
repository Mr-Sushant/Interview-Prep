import java.util.*;
import java.io.*;
public class Factorial {
int recursive(int n)
{
    if(n==0)
        return 1;
    else
        return (n*recursive(n-1));
}
void normal(int n)
{
    int i,fact=1;
    for(i=1;i<=n;i++)
    {
        fact*=i;
    }
    System.out.println("factorial is "+fact);
}
public static void main(String args[])
{
    Factorial ob=new Factorial();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1 for recursive and 2 for normal");
    int a=sc.nextInt();
    System.out.println("Enter number");
    int n=sc.nextInt();
    switch(a)
    {
        case 1:
            int res=ob.recursive(n);
            System.out.println("Factorial is "+res);
            break;
        case 2:
            ob.normal(n);
            break;
        default :
            System.out.println("wrong choice");
    }
    
}
}
