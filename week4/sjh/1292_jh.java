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

        int res = 0;
        int cnt = 0;

        for(int i = 1; i <= b; i++) {
            for (int j = 0; j < i; j++) {
                cnt++;
                if (a <= cnt && cnt <= b) {
                    res += i;
                }
            }
        }

        bw.write(res + "");
        bw.close();
    }
}
