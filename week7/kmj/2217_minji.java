import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int max = 0;
        Integer[] c = new Integer[n];
        
        for(int i=0; i<n; i++){
            c[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(c, Collections.reverseOrder());
        
        for(int i=1; i<=n; i++){
            int a = c[i-1]*i;
            if(max<a)
                max = a;
        }

        System.out.println(max);
    }
}
