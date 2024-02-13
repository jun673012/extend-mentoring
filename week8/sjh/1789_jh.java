import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long s = Long.parseLong(br.readLine());
        int n = 0;

        while (true) {
            s -= n;
            n++;
            if (s < n) {
                n--;
                break;
            }
        }

        bw.write(String.valueOf(n));
        bw.close();
    }
}
