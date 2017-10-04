
import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("For Quadratic Equation, Enter Value of a b and c");
        double a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
        
        double delta=(b*b)-(4*a*c);
        double root1=((-b)+(Math.sqrt(delta)))/(2*a);
        double root2=((-b)-(Math.sqrt(delta)))/(2*a);
        
        System.out.println("Root Values are "+root1+" and "+root2);
	}

}

