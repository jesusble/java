import java.io.*;
import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
 		Scanner S=new Scanner(System.in);
		System.out.println("enter the no. that you want to palindrome");
		int num=S.nextInt();
		int rev=0,rem=0;
		int temp=num;
		for(int i=0;i<num;i++)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("the no. is palindrome");
		}
		else
		{	
			System.out.println("not a palindrome");
		}
	
	}
}
