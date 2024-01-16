import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[13];
        arr[0] = 1;

        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] * i;
        }

        bw.write(arr[n] + "");
        bw.close();
    }
}
