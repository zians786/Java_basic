
import java.util.Scanner;

public class StopWatch {

	public long start;
	
	public StopWatch(){
		start=System.currentTimeMillis();
	}
	
 public void elapseTime(){
	 long now=System.currentTimeMillis();
	 System.out.println("Elapse Time Between Start and End is: "+(now-start)/1000.0+" second");
 }
	
	public static void main(String[] args) {
		int sum=0;
		StopWatch stop_watch=new StopWatch();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter number");
		int number=scanner.nextInt();
		for(int i=0;i<number;i++){
			sum=sum+(int)Math.sqrt(i);
		}
		System.out.println(sum);
		stop_watch.elapseTime();

	}

}
