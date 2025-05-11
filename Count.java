import java.util.*;
class Count
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt(),start=1,count_even=0,count_odd=0;
		while(start<=n)
		{	
			if(start%2==0)
			{
				System.out.println(start);
				count_even+=1;
			}
			start++;
		}
		System.out.println("number of even "+count_even);
		System.out.println("enter value of n");
		n=sc.nextInt();
		start=1;
		while(start<=n)
		{	
			if(start%2==1)
			{
				System.out.println(start);
				count_odd+=1;
			}
			start++;
		}
		System.out.println("number of odd "+count_odd);
	}
}
		