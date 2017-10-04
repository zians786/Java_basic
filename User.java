import java.util.*;

class User{
	public static void main(String ar[])
	{
	Scanner scanner=new Scanner(System.in);
	String name="";
	System.out.println("Enter Your Name: ");
	name=scanner.nextLine();
	while(name.length()<3)
		{
			System.out.print("Please Enter At least 3 Characters of the Name.. ");
			name=scanner.nextLine();
		}
		
	System.out.print("Hello "+name+", How are you?");
	
}
}
