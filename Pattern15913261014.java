import java.util.*;
class Pattern15913261014
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			int temp=r;
			for(int c=1;c<=n;c++)
			{
					System.out.print(temp+"\t");
					temp+=n;
			}
			System.out.println();
		}
	}
}