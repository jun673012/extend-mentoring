import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i=0; i<n; i++){
            int a = input.nextInt();
            int[] cnt = new int[a+1];


            for(int j=0; j<=a; j++){
                if(j==0)
                    cnt[j] = 1;
                else if(j==1)
                    cnt[j] = 2;
                else if(j==2)
                    cnt[j] = 4;
                else
                    cnt[j] = cnt[j-1] + cnt[j-2] + cnt[j-3];
            }
            System.out.println(cnt[a-1]);
        }
    }
}
