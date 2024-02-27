import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String nums = st.nextToken();
            String[] num=nums.split(",");
            int sum=Integer.parseInt(num[0])+Integer.parseInt(num[1]);
            System.out.println(sum);
        }
    }
}
