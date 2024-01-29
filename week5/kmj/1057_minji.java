import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count = 0;
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        
        while(a != b){
            a -= a/2;
            b -= b/2;
            count++;
        }

        System.out.print(count);
    }
}
