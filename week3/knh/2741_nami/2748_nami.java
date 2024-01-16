import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] fi = new long[n+1];
        fi[0]=0;
        fi[1]=1;
        for(int i = 0; i<n-1; i++){
            fi[i+2]=fi[i]+fi[i+1];
        }
        System.out.print(fi[n]);
    }
}
