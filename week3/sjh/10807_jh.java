import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int cnt = 0;
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (v == Integer.parseInt(st.nextToken())) {
                cnt++;
            }
        }

        bw.write(cnt + "");

        bw.close();
    }
}
