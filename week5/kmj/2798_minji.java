import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int[] num = new int[a];
        int sum = 0;
        int n = 0;
        for(int i=0; i<a; i++){
            num[i] = input.nextInt();
        }

        for(int i=0; i<a-2; i++){
            for(int j=i+1; j<a-1; j++){
                for(int k=j+1; k<a; k++){
                    sum = num[i] + num[j] + num[k];
                    if(sum<=b && sum > n)
                        n = sum;
                }
            }
        }
        System.out.print(n);
    }
}
