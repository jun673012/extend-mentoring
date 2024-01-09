import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }

        if (b - a < 1) {
            bw.write(0 + "\n");
        } else {
            bw.write(b - a - 1 + "\n");
        }

        for (long i = a + 1; i < b; i++) {
            bw.write(i + " ");
        }

        bw.flush();
    }
}
