import java.util.*;
class FactOfIndividaualDigit
{

	public static int fact(int n)
	{
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	public static void individual_fact(int n)
	{
		if(n==0)
			return;
		System.out.println("factorial of"+(n%10)+" is"+fact(n%10));
		individual_fact(n/10);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		individual_fact(n);
	}
}