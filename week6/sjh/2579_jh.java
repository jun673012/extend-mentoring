import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr1 = new int[301];
        int[] arr2 = new int[301];

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        arr2[0] = arr1[0];
        arr2[1] = arr1[0] + arr1[1];
        arr2[2] = Math.max(arr1[0] + arr1[2], arr1[1] + arr1[2]);

        for (int i = 3; i < n; i++) {
            arr2[i] = Math.max(arr2[i - 2] + arr1[i], arr2[i - 3] + arr1[i - 1] + arr1[i]);
        }

        bw.write(arr2[n - 1] + "");
        bw.close();

    }
}
