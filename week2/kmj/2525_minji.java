import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        b+=c;


        if (b>=60){
            a += b/60;
            if(a>=24){
                a = a- 24;
            }
            b %= 60;
        }
        System.out.println(String.format("%d %d", a, b));
    }
}
