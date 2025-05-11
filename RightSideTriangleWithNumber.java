import java.util.*;
class RightSideTriangleWithNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			int i=1;
			for(int c=1;c<=n;c++)
				System.out.print(r+c>=n+1?(i++)+"\t":" \t");
			System.out.println();
		}
	}
}