
import java.util.*;

class power{
	public static void main(String ar[])
	{
		int n= Integer.parseInt(ar[0]);
	 if (n>=0 && n<31){
		 for(int i=0;i<n;i++)
		 {
				System.out.println((long)Math.pow(2,i));
		}
		 
		 }
	else{
		System.out.println("Enter less value");
	}
}
}
