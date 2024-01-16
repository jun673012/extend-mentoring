import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = a/4;
        for(int i=0; i<b; i++)
            System.out.print("long"+" ");
        System.out.print("int");
    }
}
