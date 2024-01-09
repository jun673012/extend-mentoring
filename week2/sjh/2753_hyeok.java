import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int y = Integer.parseInt(br.readLine());

        if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
    }
}
