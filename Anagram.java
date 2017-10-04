
import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
    public static void main(String aa[])
    {
        Scanner scan=new Scanner(System.in);
        String first_string="";
        String second_string="";
        System.out.println("Enter Two Strings to check Anagram-->");
        first_string=scan.nextLine();
        second_string=scan.nextLine();
        checkAnagram(first_string,second_string);
    }
    
    public static void checkAnagram(String first,String second){
        char[] copyOfFirst=first.toLowerCase().toCharArray();
        char[] copyOfSecond=second.toLowerCase().toCharArray();
        
        Arrays.sort(copyOfFirst);
        Arrays.sort(copyOfSecond);
        
        if(Arrays.equals(copyOfFirst, copyOfSecond))
        {
             System.out.println("Given Two Strings '"+first+"' '"+second+"' are Anagram..");
        }
        else
            System.out.println("Given Two Strings '"+first+"' '"+second+"' are Not Anagram..");
    }
}
 
