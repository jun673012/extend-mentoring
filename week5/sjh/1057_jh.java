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

        st.nextToken();
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int round = 0;

        while (k != l) {
            k = (k + 1) / 2;
            l = (l + 1) / 2;
            round++;
        }

        if (round == 0) {
            bw.write("-1");
        } else {
            bw.write(round + "");
        }

        bw.close();

    }
}
