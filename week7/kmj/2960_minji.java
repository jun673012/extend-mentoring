import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;

        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = false;

        for(int i = 0; i < prime.length; i++){
            prime[i] = true;
        }

        for(int i = 2; i <= n; i++){
            for(int j = i; j<= n; j += i){
                if(!prime[j])
                    continue;
                prime[j] = false;
                count++;
                if(count == k){
                    bw.write(String.valueOf(j));
                    break;
                }
            }
        }

        bw.close();
    }
}
