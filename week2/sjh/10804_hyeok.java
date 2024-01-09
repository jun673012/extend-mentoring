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

        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = 0; j < (end - start + 1) / 2; j++) {
                int tmp = arr[start  -1 + j];
                arr[start - 1 + j] = arr[end - 1 - j];
                arr[end - 1 - j] = tmp;
            }
        }

        for (int i = 0; i < 20; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
    }
}
