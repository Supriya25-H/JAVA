import java.util.*;
class LeftTriangleusingBinaryNumber
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
				if(r>=c)
				{
					if((r+c)%2==0)
						System.out.print("1\t");
					else
						System.out.print("0\t");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}