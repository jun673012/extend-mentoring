import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String tmp = br.readLine();
        st = new StringTokenizer(br.readLine());
        int cnt = 0;

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            boolean p = true;

            if (n == 1) {
                continue;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    p = false;
                    break;
                }
            }

            if (p) {
                cnt++;
            }
        }

        bw.write(cnt + "");
        bw.close();
    }
}
