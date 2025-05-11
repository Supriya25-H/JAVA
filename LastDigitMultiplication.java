import java.util.*;
class LastDigitMultiplication
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt(),sum=0;
		for(int i=n;i>0;i/=10)
		{
			int temp1=i%10;
			int a=i/10;
			int temp2=a%10;
			sum+=temp1*temp2;
		}
		System.out.println(sum);
	}
}