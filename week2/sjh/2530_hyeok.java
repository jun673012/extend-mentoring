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

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());

        s += d % 60;
        if (s >= 60) {
            m += s / 60;
            s %= 60;
        }
        m += d / 60;
        if (m >= 60) {
            h += m / 60;
            m %= 60;
        }
        h %= 24;
        
        bw.write(h + " " + m + " " + s);

        bw.flush();
    }
}
