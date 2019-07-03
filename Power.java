import java.io.*;
import java.util.*;
import java.lang.Math.*;
class Power
{
public static void main(String args[])
{
	Scanner S=new Scanner(System.in);
	System.out.println("enter the no. and the power");
	int base=S.nextInt();
	int exp=S.nextInt();
	double power=Math.pow(base,exp);
	System.out.println(power);
}
}

	
	
	
