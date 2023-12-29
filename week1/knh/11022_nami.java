import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.printf("Case #%d: %d + %d = %d\n", i+1,a,b, a+b);

        }

    }}
