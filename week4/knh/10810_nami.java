import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] bas = new int[n];
        for(int i=0; i<n; i++) {
            bas[i]=0;
        }
        int a,b,c;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            c=Integer.parseInt(st.nextToken());
            for(int j=a-1; j<b; j++){
                bas[j]=c;
            }
        }
        for(int i=0; i<n; i++) {
            System.out.printf("%d ",bas[i]);
        }
    }
}
