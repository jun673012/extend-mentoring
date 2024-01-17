import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        for(int i=0; i<a; i++){
            int sum = 0;
            int min = 101;
            for(int j=0; j<7; j++){
                int b = input.nextInt();

                if(b%2==0){
                    sum += b;
                    if(b<min){
                        min = b;
                    }
                }
            }
            System.out.println(sum+" "+min);
        }
    }
}
