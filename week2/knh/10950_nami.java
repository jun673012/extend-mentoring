import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int[] sum = new int[n];
        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());
            sum[i]=a+b;
        }
        for (int i=0; i<n; i++){
            System.out.println(sum[i]);
        }
    }
}
