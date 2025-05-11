import java.util.*;
class PyramidTriangleUp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=(n*2)-1;c++)
			{
				if(r+c>=n+1 && c-r<=n-1)
					System.out.print("* \t");
				else
					System.out.print("  \t");
			}
			System.out.println();
		}
	}
}