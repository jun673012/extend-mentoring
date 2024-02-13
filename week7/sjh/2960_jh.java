import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[n + 1];
        int num = 0;

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i; j <= n; j += i) {
                if (prime[j]) {
                    continue;
                }
                prime[j] = true;
                num++;
                if (num == k) {
                    bw.write(String.valueOf(j));
                    break;
                }
            }
        }

        bw.close();

    }
}
