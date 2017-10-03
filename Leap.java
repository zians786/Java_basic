import java.util.*;

class Leap{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	String n;
	System.out.println("Enter Year: ");
	n=sc.nextLine();
	
	if(n.length()==4){
		int i=Integer.parseInt(n);
	if(i%4==0)
	{	System.out.println(n+", It's a Leap Year..");
	}
	else
	{	System.out.println(n+" --> It's not a Leap Year..");
	}
}
else
{System.out.println("Input year value is not correct..");}


}
}
