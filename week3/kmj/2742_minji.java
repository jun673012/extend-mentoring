import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        for (int i=0; i<a ; i++){
            System.out.println(a-i);
        }
    }
}
