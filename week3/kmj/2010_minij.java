import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int sum = 0;
        for(int i=0 ; i<a; i++){
            int b = input.nextInt();
            sum += b;
        }
        System.out.print(sum-(a-1));
    }
}
