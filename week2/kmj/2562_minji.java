import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        int max = 0;
        for(int i=0; i<9; i++){
            int b = input.nextInt();
            if(max<b){
                max = b;
                count = i+1;
            }
        }
        System.out.println(max);                  
        System.out.println(count);
    }
}
