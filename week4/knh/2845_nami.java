import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int num = a*b;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<5; i++){
            int x = Integer.parseInt(st.nextToken());
            System.out.printf("%d ", x-num);
        }
    }
}
