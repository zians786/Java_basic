
import java.util.*;

public class Coupon
{
	public static void main(String[] args)
	{
		int distinct=0,number,count=0;
		
		System.out.println("Enter Number");
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		int [] a=new int[number];
		while(distinct!=number)
		{
			boolean status=true;
			int random=(int)(Math.random()*number+1);
			count++;
			for(int i=0;i<distinct;i++)
			{
				if(a[i]==random)
				{
					status=false;
					break;
				}
			}
			if(status==true)
			{
				a[distinct]=random;
				distinct++;
			}
		
		}
		System.out.println("Total Random number generated --> "+count);
		System.out.println("unique Coupon number are as Follow..");
		for(int i=0;i<number;i++)
		{
			System.out.println(a[i]);
		}
	}
}
