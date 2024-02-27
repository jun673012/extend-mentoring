import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] chess = {1,1,2,2,2,8};
        for(int i=0; i<6; i++){
            int n=Integer.parseInt(st.nextToken());
            System.out.printf("%d ",chess[i]-n);
        }

    }
}
