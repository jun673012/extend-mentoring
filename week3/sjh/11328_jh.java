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
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            int[] res = new int[26];

            char[] aArr = a.toCharArray();
            char[] bArr = b.toCharArray();

            for (char j : aArr) {
                res[j - 'a']++;
            }
            for (char j : bArr) {
                res[j - 'a']--;
            }

            boolean f = true;

            for (int j : res) {
                if (j != 0) {
                    f = false;
                    break;
                }
            }

            if (f) {
                bw.write("Possible\n");
            } else {
                bw.write("Impossible\n");
            }
        }

        bw.close();
    }
}
