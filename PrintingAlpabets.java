import java.util.*;
class PrintingAlpabets
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
				System.out.print((char)(96+r)+"\t");
			}
			System.out.println();
		}
	}
}