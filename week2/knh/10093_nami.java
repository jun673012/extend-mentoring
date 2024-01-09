import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class proweek1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        long n =Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        if (n==m){
            System.out.print(0);
        } else if(n<m){
            System.out.println(m-n-1);
            for (long i=n+1; i<m; i++){
                System.out.print(i+" ");
            }
        } else {
            System.out.println(n-m-1);
            for (long i=m+1; i<n; i++){
                System.out.print(i+" ");
            }
        }

    }
}
