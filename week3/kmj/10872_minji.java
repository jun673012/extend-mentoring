import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int n = 1;
        for(int i=1; i<=a; i++){
            n *= i;
        }
        System.out.print(n);
    }
}
