import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        long n = Long.parseLong(br.readLine());
        int result = 0;

        for(int i=1; i<n+1; i++){
            if(n-i < 0)
                break;
            n -= i;
            result = i;
        }

        bw.write(String.valueOf(result));
        bw.close(); 
    }
}
