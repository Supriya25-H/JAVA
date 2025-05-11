import java.util.*;
class FactorialOfIndividualNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		while(n>0)
		{
			int last=n%10,fact=1,temp=last;
			while(last>=2)
				fact*=last--;
			System.out.println("factorial of "+temp+" is "+fact);
			n/=10;
		}
	}
}