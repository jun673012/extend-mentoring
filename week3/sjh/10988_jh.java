import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String w = br.readLine();
        int cnt = 0;
        
        for (int i = 0; i < w.length() / 2; i++) {
            if (w.charAt(i) == w.charAt(w.length() - 1 - i)) {
                cnt++;
            }
        }
        
        if (w.length() / 2 == cnt) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.close();
    }
}
