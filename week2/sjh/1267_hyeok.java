import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = 0;
        int m = 0;

        for (int i = 0 ; i < n; i++) {
            int t = Integer.parseInt(st.nextToken());
            y += (t / 30 + 1) * 10;
            m += (t / 60 + 1) * 15;
        }

        if (y < m) {
            bw.write("Y " + y);
        } else if (y > m) {
            bw.write("M " + m);
        } else {
            bw.write("Y M " + y);
        }

        bw.flush();
    }
}
