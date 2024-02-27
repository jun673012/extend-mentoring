import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long sum=0;
        int count =0;
        for(int i=1; ; i++){
            if(sum>N) break;
            sum+=i;
            count ++;
        }
        System.out.print(count-1);
    }
}
