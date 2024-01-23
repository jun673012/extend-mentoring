import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 10_001;

        for (int i = 1; i + i <= n; i++) {
            if (i * i >= m && i * i <= n) {
                sum += i * i;
                min = Math.min(min, i * i);
            }
        }

        if (sum == 0) {
            bw.write("-1");
        } else {
            bw.write(sum + "\n" + min);
        }

        bw.close();

    }
}
