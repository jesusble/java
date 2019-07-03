import java.io.*;
import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
 		Scanner S=new Scanner(System.in);
		System.out.println("enter the no. that you want to reverse");
		int num=S.nextInt();
		int rev=0,rem=0;
		for(int i=0;i<num;i++)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("the reversed no. is:"+rev);
	}
}
