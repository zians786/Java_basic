

import java.util.*;

class Harmonic{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number-->");
		int number=scanner.nextInt();
		float total=0;
		while(number==0)
		{
			System.out.println("Please Enter value more than " +number);
			number=scanner.nextInt();
		}
		for(float i=1;i<=number;i++) 
		{	
			total=total+(1/i);
		}
	System.out.println("Value of Harmonic Series is --> "+total);
	
	
	}
}
