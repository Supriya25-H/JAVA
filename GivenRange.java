import java.util.*;
class GivenRange
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		if(n>=90 && n<=100)
			System.out.println(n+" is in the given range");
		else
			System.out.println(n+" is not in the given range");

	}
}