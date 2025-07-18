import java.lang.*;
import java.util.*;
class palindrome
{
	public static void main (String arg[])
	{
		int n;
		System.out.println ("Enter a number which u want to insert : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int original=n,rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		 
		if(rev==original)
		{
		System.out.println("Number is palindrome");
		}
		else 
		{
		 System.out.println("Number is  not palindrome");
		}
	}
}