import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        
        for(int i=1; i<a+1; i++){
            for(int j=a-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=a-1; i>0; i--){
            for(int j=a-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
