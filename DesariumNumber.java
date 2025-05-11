import java.util.*;
class DesariumNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt(),sum=0,temp=n;
		while(n>0)
		{	
			int count=0;
			for(int i=n;i>0;i/=10)
				count++;
			int last=n%10,power=1;
			for(int i=1;i<=count;i++)
				power*=last;
			sum+=power;
			n/=10;
		}
		if(sum==temp)
			System.out.println(temp+" is Desarium number");
		else
			System.out.println(temp+" is not Desarium number");
		
	}
}
		
		
				