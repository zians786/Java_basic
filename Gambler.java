import java.util.*;
class Gambler{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter $Stake , $Goal and number of times want to play-->");
		int $stake=sc.nextInt();
		int $goal=sc.nextInt();
		int n=sc.nextInt();
		int bet=0;
		int won=0;
		int loss=0;
	if($stake!=$goal)
	{
		for(int i=0;i<n;i++)
		{
			if($stake>=0 && $stake!=$goal)
		{	
			if(0.5<=Math.random())
			{
				$stake=$stake+1;
				won++;
				}
			else
			{	$stake=$stake-1;
				loss++;
				}
			
				bet++;
			}
			else
			break;	
		}
		
		System.out.println("Percentage of Won is : "+(won*100)/bet);
		System.out.println("Percentage of Loss is : "+(loss*100)/bet);
	}
	else
	{	
		System.out.println("Stake and Goal is same no need to play");	
	}
	
}
}
