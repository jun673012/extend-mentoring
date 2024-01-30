import java.util.*;
import java.lang.Math;
 
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(n==2){
            int a = input.nextInt();
            int b = input.nextInt();
            int min = Math.min(a, b);

            for(int i=1; i<min+1; i++){
                if(a%i==0 && b%i==0)
                    System.out.println(i);
            }
        }

        if(n==3){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int min = Math.min(Math.min(a, b),c);

            for(int i=1; i<min+1; i++){
                if(a%i==0 && b%i==0 && c%i==0)
                    System.out.println(i);
            }
        }
    }
}
