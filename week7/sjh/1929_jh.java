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

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j <= n; j += i) {
                prime[j] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (!prime[i]) {
                bw.write(i + "\n");
            }
        }

        bw.close();

    }
}
