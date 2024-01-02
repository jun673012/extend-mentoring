import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b, c, d, f;

        a = input.nextInt();
        b = input.nextInt();
        c = b%10;
        d = (b/10)%10;
        f = b/100;

        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println(a*f);
        System.out.println(a*b);
    }
}
