import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Integer[] price = new Integer[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            price[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(price, Collections.reverseOrder());

        int total = 0;
        for(int i=0; i<N; i++){
            if(i%3==2) continue;
            total += price[i];
        }
        System.out.print(total);
    }
}
