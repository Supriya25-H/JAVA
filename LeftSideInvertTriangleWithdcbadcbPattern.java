import java.util.*;
class LeftSideInvertTriangleWithdcbadcbPattern
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			int i=n;
			for(int c=1;c<=n;c++)
					System.out.print(r+c<=n+1?(char)(96+i--)+"\t":" \t");
			System.out.println();
		}
	}
}