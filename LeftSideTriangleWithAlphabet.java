import java.util.*;
class LeftSideTriangleWithAlphabet
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			char ch='a';
			for(int c=1;c<=n;c++)
				System.out.print(r>=c?(ch++)+"\t":" \t");
			System.out.println();
		}
	}
}