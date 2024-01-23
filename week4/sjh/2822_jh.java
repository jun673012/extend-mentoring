import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[8];
        int[] idx = new int[8];
        int sum = 0;

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            idx[i] = arr[i];
        }

        Arrays.sort(arr);

        for(int i = 3; i < 8; i++) {
            sum += arr[i];
        }

        bw.write(sum + "\n");

        for(int i = 0; i < 8; i++) {
            for (int j = 3; j < 8; j++) {
                if (idx[i] == arr[j]) {
                    bw.write((i + 1) + " ");
                }
            }
        }

        bw.close();
    }
}
