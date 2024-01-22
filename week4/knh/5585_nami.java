import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        n=1000-n;
        int cnt=0;
        int[] money={500,100,50,10,5,1};
        for (int i=0; i<money.length; i++){
            cnt+=(n/money[i]);
            n%=money[i];
        }
        System.out.print(cnt);
    }
}
