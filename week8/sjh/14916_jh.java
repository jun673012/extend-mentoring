import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] coins = {5, 2};
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n > 0) {
            if (n % coins[0] == 0) {
                count += n / coins[0];
                n = 0;
            } else {
                n -= coins[1];
                count++;
            }
        }

        if (n != 0) {
            count = -1;
        }
        
        bw.write(count + "\n");
        bw.close();
    }
}
