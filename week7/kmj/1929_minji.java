import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[n + 1];

        for(int i = 0; i < prime.length; i++){
            prime[i] = true;
        }
        prime[0] = prime[1] = false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(prime[i]){
                for(int j = i*i; j<= n; j += i){
                    prime[j] = false;
                }
            }
        }
        for(int i=m; i<=n; i++){
            if(prime[i] == true)
                bw.write(i + "\n");
                
        }

        bw.close();
    }
}
