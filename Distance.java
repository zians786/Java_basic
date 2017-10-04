
public class Distance {

	public static void main(String[] args) {
		double first=Math.pow(Double.parseDouble(args[0]),2);
		double second=Math.pow(Double.parseDouble(args[1]),2);
		double distance=Math.sqrt(first+second);
		System.out.println("Distance From the Origin Is --> "+distance);

	}

}
