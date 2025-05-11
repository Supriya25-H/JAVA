import java.util.*;
class Amstrong
{
								
	public static int fact(int n)
	{
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	public static int individual_fact(int n,int sum)
	{
		if(n==0)
			return sum;
		return sum+fact(n%10)+individual_fact(n/10,sum);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println(individual_fact(n,0)==n?n+" is Amstrong number":n+"is not a Amstrong number");
	}
}