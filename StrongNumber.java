import java.util.*;
class StrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt(),sum=0,temp=n;
		while(n>0)
		{
			int last=n%10,fact=1;
			while(last>=2)
				fact*=last--;
			sum+=fact;
			n/=10;
		}
		if(sum==temp)
			System.out.println("Strong number");
		else
			System.out.println("not Strong Number");
	}
}