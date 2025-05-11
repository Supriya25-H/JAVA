import java.util.*;
class Tables
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" * "+j+" = "+(i*j));
				//System.out.printf("%2d x %2d = %3d\t", i, j, j * i);
			}
			System.out.println();
		}
	}
}