import java.util.*;
class LeftTriangleWithNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int temp=1;
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				if(r>=c)
					System.out.print((temp++)+"\t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
	}
}