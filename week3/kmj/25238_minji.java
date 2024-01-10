import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextInt();
        double b = input.nextInt();

        double d = b/100;
        double c = a-a*d;
        if(c>100)
            System.out.println(0);
        else
            System.out.println(1);
    }
}
