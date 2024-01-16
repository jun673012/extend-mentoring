import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] arr = {25, 10, 5, 1};

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());

            for (int j = 0; j < 4; j++) {
                int a = c / arr[j];
                c %= arr[j];
                bw.write(a + " ");
            }

            bw.newLine();
        }

        bw.close();
    }
}
