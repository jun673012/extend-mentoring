import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        if (b>=45)
            b = b - 45;
        else if (b < 45 & a>0){
            a = a-1;
            b= b + 15;
        }
        else{
            a = 23;
            b = b + 15; 
        }
        
        System.out.println(String.format("%d %d", a, b));
            
    }
}
