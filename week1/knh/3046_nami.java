import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int s = scanner.nextInt();

        int y = s*2 - x;
        System.out.println(y);

    }}
