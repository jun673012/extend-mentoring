import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        
        for(int i=0; i<9; i++){
            int b = input.nextInt();
            a -= b;
        }
        System.out.print(a);
    }
}
