import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int oddSum = 0;
        int minNum = 100;

        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 1) {
                oddSum += n;
                if (n < minNum) {
                    minNum = n;
                }
            }
        }

        if (oddSum == 0) {
            bw.write("-1");
        } else {
            bw.write(oddSum + "\n" + minNum);
        }

        bw.flush();
    }
}
