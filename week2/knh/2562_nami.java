import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int max=0;
        int[] num = new int[9];
        for (int i=0; i<9; i++){
            num[i]= scanner.nextInt();
            if(num[i]>max){
                max=num[i];
                n=i;
            }
        }

        System.out.print(max+"\n"+(n+1));
    }}
