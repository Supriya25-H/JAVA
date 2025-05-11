import java.util.*;
class PrintingPlusPattern
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
				if(r==(n+1)/2 || c==(n+1)/2)
					System.out.print("*\t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
	}
}