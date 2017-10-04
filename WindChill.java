

import java.util.*;

public class WindChill {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        Double t=Double.parseDouble(args[0]);
        Double v=Double.parseDouble(args[1]);
        if(t<=50 && v<=120 && v>=3){
            
        double wind_chill=35.74+(0.6215*t)+(((0.427*t)-35.75)*Math.pow(v, 0.16));
        System.out.println("Wind Chill is as follow... "+wind_chill);
    }
        else 
        {
            System.out.println("incorrect value..");
            
        }
    }
}
