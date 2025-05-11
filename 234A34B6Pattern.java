import java.util.*;
class Pattern234A34B6
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
				if(r+c==n+1)
					System.out.print((char)(64+r)+"\t");
				else
					System.out.print(r+c+"\t");
			}
			System.out.println();
		}
	}
}