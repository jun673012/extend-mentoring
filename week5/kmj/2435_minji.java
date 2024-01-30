import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int[] num = new int[n];
        int[] sum = new int[n-k+1];
        int max = -100;
        
        for(int i=0; i<n; i++){
            num[i] = input.nextInt();
        }

        for(int i=0; i<n-k+1; i++){
            for(int j=i; j<k+i; j++){
                sum[i] += num[j];
            }
        }

        for(int i=0; i<sum.length; i++){
            if(max<sum[i]){
                max = sum[i];
            }
        }

        System.out.print(max);
    }
}
