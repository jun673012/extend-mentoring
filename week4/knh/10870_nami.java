import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int m=1;
        int sum=0;
        int x;
        for (int i=1; i<n+1; i++){
            x=sum;
            sum+=m;
            m=x;
        }
        System.out.print(sum);
    }
}
