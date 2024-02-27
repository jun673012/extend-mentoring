import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String m = st.nextToken();
        String[] nums=m.split("");
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=Integer.parseInt(nums[i]);
        }

        System.out.print(sum);
    }
}
