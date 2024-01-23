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

        int[] arr = new int[n];
        int[] arr2 = new int[n- k + 1];
        int max = -101;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] += Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n - k + 1; i++) {
            for (int j = i; j < i + k; j++) {
                arr2[i] += arr[j];
            }
        }

        for (int i : arr2) {
            if (max < i) {
                max = i;
            }
        }

        bw.write(max + " ");
        bw.close();

    }
}
