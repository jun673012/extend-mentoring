import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            int a = input.nextInt();
            arr[i] = a;
            sum += a;
        }
        Arrays.sort(arr);
        System.out.println((sum/5)+"\n"+arr[2]);
    }

}
