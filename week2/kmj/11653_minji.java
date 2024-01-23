import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        for(int i=2; i*i<a+1; i++){
            while(a%i == 0){
                System.out.print(i+"\n");
                a = a/i;
            }
        }
        if(a != 1) {
        	System.out.print(a);
        }
        
    }
}
