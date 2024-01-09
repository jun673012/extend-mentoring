import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int min = 100;
        for(int i=0; i<7; i++){
            int a = input.nextInt();
            if (a%2==1){
                sum += a;
                if(a<min){
                    min = a;
                }
            }
        }
        if(sum==0){
            System.out.println(-1);
        }
        else
            System.out.println(sum+"\n"+min);
    }

}
