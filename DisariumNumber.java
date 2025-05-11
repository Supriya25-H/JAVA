import java.util.*;
class DisariumNumber
{
	public static int count(int n)
	{
		int count=0;
		for(int i=n;i>0;i/=10)
			count++;
		return count;
	}
	public static int power(int n,int count)
	{
		int pow=1;
		for(int i=1;i<=count;i++)
			pow*=n;
		return pow;
	}
	public static int disarium(int n)
	{
		int sum=0;
		for(int i=n;i>0;i/=10)
			sum+=power(i%10,count(i));
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		System.out.println(disarium(n)==n?n+" is disarium number":n+" is not disarium number");
	}
}