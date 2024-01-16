import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[2][6];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[s][y - 1]++;
        }

        int cnt = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                cnt += arr[i][j] / k;
                if (arr[i][j] % k != 0) {
                    cnt++;
                }
            }
        }

        bw.write(cnt + "\n");
        bw.close();
    }
}
