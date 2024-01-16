import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String pw = br.readLine();
            if (6 <= pw.length() && pw.length() <= 9) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.close();
    }
}
