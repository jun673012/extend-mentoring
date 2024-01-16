import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();

        int[] arr = new int[10];

        for (int i : n.toCharArray()) {
            int cnt = i - '0';

            if (cnt == 6 || cnt == 9) {
                if (arr[6] < arr[9]) {
                    arr[6]++;
                } else {
                    arr[9]++;
                }
            }
            else {
                arr[cnt]++;
            }
        }

        int max = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        bw.write(max + "");
        bw.close();
    }
}
