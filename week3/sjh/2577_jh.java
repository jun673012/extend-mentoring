import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int n = a * b * c;

        int[] arr = new int[10];

        while (n > 0) {
            arr[n % 10]++;
            n /= 10;
        }

        for (int i : arr) {
            bw.write(i + "\n");
        }

        bw.close();
    }
}
