import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        bw.write(n - sum + "");
        bw.close();
    }
}
