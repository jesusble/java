import java.io.*;
import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
	Scanner S=new Scanner(System.in);
	int num=S.nextInt();
	System.out.println("enter the limit");
	int i,b=0,t1=0,t2=1,temp;
	for(i=0;i<num;i++)
	{
		System.out.println(t1);
		temp=t1+t2;
		t1=t2;
		t2=temp;
	}
}
}
