import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            
        int A = input.nextInt();
        int B = input.nextInt();

        for (int i=0; i<A; i++){
            int a = input.nextInt();
            if(a<B){
                System.out.print(a+" ");
            }
        }
    }
}
