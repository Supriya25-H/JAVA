import java.util.*;
class AmstrongNumber
{
	public static int count(int n)
	{
		int count=0;
		for(int i=n;i>0;i/=10)
			count++;
		return count;
	}
	public static int power(int last,int c)
	{	
		int pow=1;
		for(int i=1;i<=c;i++)
			pow*=last;
		return pow;
	}
	public static int amstrong(int n)
	{
		int c=count(n);
		int sum=0;
		for(int i=n;i>0;i/=10)
			sum+=power(i%10,c);
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		System.out.println(amstrong(n)==n?n+" is amstrong number":n+" not a amstrong number");
	}
}