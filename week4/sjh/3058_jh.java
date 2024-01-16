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

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int even = 0;
            int min = 101;
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 7; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (n % 2 == 0) {
                    even += n;
                    if (min > n) {
                        min = n;
                    }
                }
            }

            bw.write(even + " " + min + "\n");
        }

        bw.close();
    }
}
