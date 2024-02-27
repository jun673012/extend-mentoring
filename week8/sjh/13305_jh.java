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

        int n = Integer.parseInt(br.readLine());
        int[] loads = new int[n - 1];
        int[] oil = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            loads[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            oil[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        long min = oil[0];
        for (int i = 0; i < n - 1; i++) {
            sum += min * loads[i];
            if (min > oil[i + 1]) {
                min = oil[i + 1];
            }
        }

        bw.write(sum + "\n");
        bw.close();
    }
}
