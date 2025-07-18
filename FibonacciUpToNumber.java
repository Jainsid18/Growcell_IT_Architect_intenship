import java.lang.*;
import java.util.*;
public class FibonacciUpToNumber{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum number for Fibonacci sequence: ");
		int limit=sc.nextInt();
		
		int a=0,b=1;
		System.out.println("Fibonacci sequence up to "+limit +":");
		System.out.print(a + " ");
		
		while (b<=limit)
		{
			System.out.print(b+" ");
			int next=a+b;
			a=b;
			b=next;
		}
		sc.close();
	}
	
}