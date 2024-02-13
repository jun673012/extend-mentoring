import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int level = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n - 1; i > 0; i--) {
            if (arr[i] <= arr[i - 1]) {
                level += arr[i - 1] - arr[i] + 1;
                arr[i - 1] = arr[i] - 1;
            }
        }
        
        bw.write(String.valueOf(level));
        bw.close();

    }
}
