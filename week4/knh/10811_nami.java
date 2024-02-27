import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] bas = new int[n];
        for(int i=0; i<n; i++) {
            bas[i]=i+1;
        }
        int a,b;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            while(a<b){
                int temp = bas[a-1];
                bas[a-1]=bas[b-1];
                bas[b-1]=temp;
                a++;
                b--;
            }
        }
        for(int i=0; i<n; i++) {
            System.out.printf("%d ",bas[i]);
        }
    }
}
