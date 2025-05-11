import java.util.*;
class A1112B22Pattern
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
				if(r==c)
					System.out.print((char)(64+r)+"\t");
				else
					System.out.print(r+"\t");
			}
			System.out.println();
		}
	}
}