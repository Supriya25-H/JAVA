import java.util.*;
class DisplayingPosition
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt(),count=0;
		for(int i=n;i>0;i/=10)
		{	
			int lst=i%10;
			count++;
			if(count==1)
				System.out.println(lst+" in Unit place ");
			else if(count==2)
				System.out.println(lst+" in Hundred place ");
			else if(count==3)
				System.out.println(lst+" in Thousand place ");
			else if(count==4)
				System.out.println(lst+" in  Ten-thousand place ");
			else if(count==2)
				System.out.println(lst+" in lakh place ");
		}
	}
}
		