import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int sum_y = 0;
        int sum_m = 0;
        
        for(int i=0; i<a; i++){
            int b = input.nextInt();
            int y = b/30;
            int m = b/60;
            sum_y += 10+(y*10);
            sum_m += 15+(m*15);
        }
        if(sum_y>sum_m)
            System.out.print("M"+" "+sum_m);
        else if(sum_y<sum_m)
            System.out.print("Y"+" "+sum_y);
        else
            System.out.print("Y"+" "+"M"+" "+sum_y);
    }
}
