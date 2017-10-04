import java.util.*;

class Leap{
	public static void main(String ar[])
	{
	Scanner scanner=new Scanner(System.in);
	String year_value;
	System.out.println("Enter Year: ");
	year_value=scanner.nextLine();
	
	if(year_value.length()==4)
{
		int year=Integer.parseInt(year_value);
	if(year%4==0)
	{	
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println(year+", It's a Leap Year..");
			}
			else
			{
				System.out.println(year+" --> It's not a Leap Year..");
			}
		}
		else
		{
			System.out.println(year+", It's a Leap Year..");
		}
	}	
	else
	{
		System.out.println(year+" --> It's not a Leap Year..");
	}
}
else
{
	System.out.println("Input year value is not correct..");
}
}
}
