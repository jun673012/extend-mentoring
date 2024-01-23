import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {500, 100, 50, 10, 5, 1};

        int money = 1000 - Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i : arr) {
            cnt += money / i;
            money %= i;
        }

        bw.write(cnt + "\n");
        bw.close();
    }
}
