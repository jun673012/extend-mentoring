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

        if (a < b && a < c) {
            bw.write(a + " ");
            if (b < c) {
                bw.write(b + " " + c);
            } else {
                bw.write(c + " " + b);
            }
        }
        if (b < a && b < c) {
            bw.write(b + " ");
            if (a < c) {
                bw.write(a + " " + c);
            } else {
                bw.write(c + " " + a);
            }
        }
        if (c < a && c < b) {
            bw.write(c + " ");
            if (a < b) {
                bw.write(a + " " + b);
            } else {
                bw.write(b + " " + a);
            }
        }

        bw.flush();
    }
}
