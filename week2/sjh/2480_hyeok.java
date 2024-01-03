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

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c) {
            bw.write(10000 + a * 1000 + "");
        } else if (a == b || a == c) {
            bw.write(1000 + a * 100 + "");
        } else if (b == c) {
            bw.write(1000 + b * 100 + "");
        } else {
            bw.write(Math.max(Math.max(a, b), c) * 100 + "");
        }

        bw.flush();
    }
}
