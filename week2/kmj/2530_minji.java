import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        
        
        b += d/60;
        c += d%60;
        if (c>=60){
            b += c/60;
            c = c%60;
            if (b>=60){
                a += b/60;
                b = b%60;
                if (a>=24){
                    a = a%24;
                }
            }
        }
        else if (b>=60){
                a += b/60;
                b = b%60;
                if (a>=24){
                    a = a%24;
                }
        }
        System.out.println(String.format("%d %d %d", a, b, c));
    }
}
