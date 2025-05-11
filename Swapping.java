import java.util.*;
class Swapping
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two operands:");
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("before swap "+a+ " & " +b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swap "+a+ " & " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap "+a+ " & " +b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swap "+a+ " & " +b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swap "+a+ " & " +b);
	}
}