import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] num = new int[3];
        
        num[0] = input.nextInt();
        num[1] = input.nextInt();
        num[2] = input.nextInt();
        
        Arrays.sort(num);
        System.out.println(num[1]);
    }
}
