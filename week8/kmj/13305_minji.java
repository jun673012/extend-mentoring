import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Long[] km = new Long[n-1];
        Long[] p = new Long[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n-1; i++) {
            km[i] =  Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            p[i] = Long.parseLong(st.nextToken());
        }
        
        long a = p[0];
        long result = 0;
 
        for(int i=0; i<n-1; i++){
            if(p[i] < a)
                a = p[i];
            result += a*km[i];
        }
        System.out.print(result);
        
    }
}
