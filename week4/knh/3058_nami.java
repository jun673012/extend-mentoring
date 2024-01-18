import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m=100;

        int sum=0;
        int min=100;
        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<7; j++) {
                m=Integer.parseInt(st.nextToken());
                if(m%2==0){
                    sum+=m;
                    if(min>m){
                        min=m;
                    }
                }
            }
            System.out.printf("%d %d\n",sum,min);
            sum=0;
            min=100;
        }
    }
}
