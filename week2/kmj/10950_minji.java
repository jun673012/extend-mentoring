import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        for(int i=0; i<a; i++){
            int c = input.nextInt();
            int b = input.nextInt();
            System.out.println(c+b);
        }
    }
}
