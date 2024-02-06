import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr1 = new int[41];
        int[] arr2 = new int[41];

        arr1[0] = 1;
        arr1[1] = 0;
        arr2[0] = 0;
        arr2[1] = 1;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= n; j++) {
                arr1[j] = arr1[j - 1] + arr1[j - 2];
                arr2[j] = arr2[j - 1] + arr2[j - 2];
            }
            bw.write(arr1[n] +  " " + arr2[n] + "\n");
        }

        bw.close();

    }
}
