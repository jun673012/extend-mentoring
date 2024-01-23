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

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[Integer.parseInt(st.nextToken())];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            int min = 100;
            int gap = 0;

            Arrays.sort(arr);

            for (int value : arr) {
                if (value > max) {
                    max = value;
                }

                if (value < min) {
                    min = value;
                }
            }

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] - arr[j] > gap) {
                    gap = arr[j + 1] - arr[j];
                }
            }

            bw.write("Class " + (i + 1) + "\n");
            bw.write("Max " + max + ", Min " + min + ", Largest gap " + gap + "\n");
        }

        bw.close();
    }
}
