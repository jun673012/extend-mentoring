import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int b1 = b % 10;
        int b2 = b % 100 / 10;
        int b3 = b / 100;

        System.out.println(a * b1);
        System.out.println(a * b2);
        System.out.println(a * b3);
        System.out.println(a * b);

    }
}
