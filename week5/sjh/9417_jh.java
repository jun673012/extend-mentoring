import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[st.countTokens()];
            BigInteger max = BigInteger.valueOf(0);

            for (int j = 0; st.hasMoreTokens(); j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    BigInteger a = BigInteger.valueOf(arr[j]);
                    BigInteger b = BigInteger.valueOf(arr[k]);
                    BigInteger gcd = a.gcd(b);

                    if (gcd.compareTo(max) > 0) {
                        max = gcd;
                    }
                }
            }
            bw.write(max + "\n");

        }
        bw.close();

    }
}
