import java.util.*;

class FlipCoin{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	int n,head=0,tail=0;
	System.out.println("Enter Number of time you want to Flip--> ");
	n=sc.nextInt();
	if(n<=0)
	{
		System.out.println("Number is less than one...");
		System.exit(0);
	}
	else
	{
		
	while(n!=0)
	{
		double f=Math.random();
		if(f<0.5)
		{	head++;}
		else
		{ tail++; }
		
		
		n--;
	}
}

System.out.println("Percentage of Head --> "+(head*100)/(head+tail));
System.out.println("Percentage of Head --> "+(tail*100)/(head+tail));
}
}

