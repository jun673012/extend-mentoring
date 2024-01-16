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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BigInteger num1 = BigInteger.valueOf(n);
        BigInteger num2 = BigInteger.valueOf(m);
        BigInteger gcd = num1.gcd(num2);
        BigInteger lcm = num1.multiply(num2).divide(gcd);

        bw.write(gcd + "\n" + lcm);
        bw.close();

    }
}
