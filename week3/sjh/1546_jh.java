import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        float[] arr = new float[n];
        float sum = 0;
        float m = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (float i : arr) {
            if (m < i) {
                m = i;
            }
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i] / m * 100;
        }

        bw.write(sum / n + "");

        bw.close();
    }
}
