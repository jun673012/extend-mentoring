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

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        BigInteger bA = BigInteger.valueOf(a);
        BigInteger bB = BigInteger.valueOf(b);

        BigInteger gcd = bA.gcd(bB);
        BigInteger lcm = bA.multiply(bB).divide(gcd);

        bw.write( lcm + " " + gcd + "\n");

        }

        bw.close();
    }
}
