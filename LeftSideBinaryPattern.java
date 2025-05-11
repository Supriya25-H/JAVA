import java.util.*;
class LeftSideBinaryPattern
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				if(r+c<=n+1)
					System.out.print((r+c)%2==0?"1\t":"0\t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
	}
}