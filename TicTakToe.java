
import java.util.Scanner;

/**
 *
 * @author FAISAL PC
 */
public class TicTakToe {
    
    public static void main(String ar[]){
		Scanner scanner=new Scanner(System.in);
		char [][] a=new char[3][3];
        int Add=0;
        System.out.println("--Tic Tac Toe--\n1.Multiplayer\n2.Single");
        int choice=scanner.nextInt();
        
 switch(choice){
	case 1:
       
        Initialize(a);
        Display(a); 
        while(Add!=9)
        {
         Player1(a);
         Add++;
         Display(a);
         Win(a,'X');
         Player2(a);
         Add++;
         Display(a);  
         Win(a,'O');
        }
        break;
     case 2:
		
        Initialize(a);
        Display(a); 
        while(Add!=9)
        {
         Computer(a);
         Add++;
         Display(a);
         Win(a,'X');
         Player2(a);
         Add++;
         Display(a);  
         Win(a,'O');
        }
    }
  }  
    public static void Initialize(char[][] a){
          for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]='-';
            }
        }
        
    
    }
   
    public static void Computer(char[][] a)
    {
        int row=(int)(Math.random()*2);
        int col=(int)(Math.random()*2);
        
            while(a[row][col]!='-')
            {
                  row=(int)(Math.random()*2+1);
                  col=(int)(Math.random()*2+1);
             }
            a[row][col]='X';
    }
   
   
    public static void Player1(char[][] a)
    {
        System.out.println("Player 1 -->");
        System.out.println("Enter your Row And Col-->");
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();
        while(a[row][col]!='-'){
            System.out.println("This Position is Already, Please Enter correct one..");
            row=scan.nextInt();
            col=scan.nextInt();
             }
            a[row][col]='X';
    }
   
    
     public static void Player2(char[][] a)
    {
        System.out.println("Player 2 -->");
        System.out.println("Enter your Row And Col-->");
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();
        while(a[row][col]!='-'){
            System.out.println("This Position is Already, Please Enter correct one..");
            row=scan.nextInt();
            col=scan.nextInt();
             }
            a[row][col]='O';
    }
     
     
    public static void Display(char[][] a){
            for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
                System.out.println();
         }
    
  System.out.println();
    }
    
    public static void Win(char[][] a,char c){
        if( 
                (a[0][0] == c && a[0][1] == c && a[0][2]==c) ||
                (a[0][0] == c && a[1][1] == c && a[2][2]==c) ||
                (a[0][0] == c && a[1][0] == c && a[2][0]==c) ||
                (a[0][1] == c && a[1][1] == c && a[2][1]==c) ||
                (a[0][2] == c && a[1][2] == c && a[2][2]==c) ||
                (a[1][0] == c && a[1][1] == c && a[1][2]==c) ||
                (a[2][0] == c && a[1][1] == c && a[0][2]==c) ||
                (a[2][0] == c && a[2][1] == c && a[2][2]==c))
        {
            System.out.println("Player with '"+c+"' Won");
            System.exit(0);
        } 
        
        else {
            
        }
    }
    
} 


