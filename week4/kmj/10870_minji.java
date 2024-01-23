import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int[] num = new int[21];

        num[0] = 0;
        num[1] = 1;

        for(int i=2; i<a+1; i++){
            num[i] = num[i-1] + num[i-2];
        }
    
        System.out.println(num[a]);
    }
}
