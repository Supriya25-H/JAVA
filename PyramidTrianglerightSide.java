import java.util.*;
class PyramidTrianglerightSide
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int r=1;r<=(n*2)-1;r++)
		{
			for(int c=1;c<=n;c++)
			{
				if(r>=c && r+c<=n*2)
					System.out.print("* \t");
				else
					System.out.print("  \t");
			}
			System.out.println();
		}
	}
}