import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] c = new int[n];
        
        for(int i=0; i<n; i++){
            c[i] = Integer.parseInt(br.readLine());
        }

        for(int i=n-1; i>=0; i--){
            if(c[i] <= k){
                count += k/c[i];
                k = k%c[i];
            }
        }

        System.out.println(count);
        
    }
}
