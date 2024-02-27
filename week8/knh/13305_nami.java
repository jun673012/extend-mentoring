import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long[] distance = new long[N-1];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++){
            distance[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        long[] L_price = new long[N];
        for(int i=0; i<N; i++){
            L_price[i]=Integer.parseInt(st.nextToken());
        }
        long total = 0;
        long price_min = L_price[0];
        for(int i=0; i<N-1; i++){
            if(L_price[i]<price_min) {
                price_min=L_price[i];
            }
            total += (price_min * distance[i]);
        }
        System.out.print(total);
    }
}
