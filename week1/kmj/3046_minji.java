import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int R1, S;

        R1 = input.nextInt();
        S = input.nextInt();

        System.out.println(2*S-R1);
    }
}
