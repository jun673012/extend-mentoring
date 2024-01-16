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
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            String password = st.nextToken();
            int l = password.length();
            if (l >= 6 && l <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
