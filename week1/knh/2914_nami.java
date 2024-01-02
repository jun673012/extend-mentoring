import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double l = scanner.nextInt();
        int m = (int) Math.ceil(a*(l-1) + 1);

        System.out.println(m);



    }}
