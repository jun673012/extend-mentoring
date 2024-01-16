import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if(b==1)
            System.out.println(280);
        else if(b==0 && a<12 ||  a>16)
            System.out.println(280);
        else if (b==0 && a>11 || a<=16)
            System.out.println(320);
    }
}
