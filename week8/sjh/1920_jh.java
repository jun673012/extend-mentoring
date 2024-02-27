import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        br.readLine();
        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = n - 1;
            boolean check = false;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] == num) {
                    check = true;
                    break;
                } else if (arr[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (check) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.close();

    }
}
