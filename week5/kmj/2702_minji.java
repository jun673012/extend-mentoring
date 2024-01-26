import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i=0; i<n; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = a*b;

            while(b != 0){
                a = a%b;
                int temp = a;
                a = b;
                b = temp;
            }

            System.out.println(c/a+" "+a);
            
        }
    }
}
