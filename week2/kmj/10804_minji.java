import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[21];

        int temp = 0;
        for(int i=1; i<21; i++){
            num[i-1] = i;
        } 

        for(int i=0; i<10; i++){
            int a =input.nextInt();
            int b =input.nextInt();
            for (int j=0;j<(b-a+1)/2;j++){
                temp=num[a-1+j];
                num[a-1+j]=num[b-1-j];
                num[b-1-j]= temp;
            }
        }
        for(int i=0; i<20; i++){
            System.out.print(num[i]+" ");
        }
    }
}
