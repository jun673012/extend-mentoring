import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        String strx = scanner.nextLine();
        int x = Integer.parseInt(strx);

        String stry = scanner.nextLine();
        int y = Integer.parseInt(stry);

        int result = x+y;
        System.out.println(result);

    }}
