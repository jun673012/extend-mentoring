import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
     
        if(A == B && A == C){
            System.out.println(10000 + A*1000);
        }
        else if (A==B && A!=C){
            System.out.println(1000 + A*100);
        }
        else if (B==C && B!=C){
            System.out.println(1000 + B*100);
        }
        else if (A==C && C!=B){
            System.out.println(1000 + A*100);
        }
        else{
            int max = A;
            if(max < B) {
                max = B;
                if (max < C) {
                    max = C;
                }
            }
            else if (max < C){
                max = C;
                if(max < B){
                    max = B;
                }
            }
            System.out.println(max*100);
        }
    }
}
