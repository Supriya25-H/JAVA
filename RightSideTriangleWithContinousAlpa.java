import java.util.*;
class RightSideTriangleWithContinousAlpa
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		char ch='a';
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
					System.out.print(r+c>=n+1?(ch++)+"\t":" \t");
			System.out.println();
		}
	}
}