import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr1 = new int[1_000_001];
        arr1[1] = 1;

        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.abs(n); i++) {
            arr1[i] = (arr1[i - 1] + arr1[i - 2]) % 1_000_000_000;
        }

        if (n < 0 && n % 2 == 0) {
            bw.write("-1\n");
        } else if (n == 0) {
            bw.write("0\n");
        } else {
            bw.write("1\n");
        }


        bw.write(arr1[Math.abs(n)] + "");
        bw.close();

    }
}
