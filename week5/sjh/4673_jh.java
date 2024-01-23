import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10001];

        for(int i = 1; i <= 10000; i++) {
            int n = d(i) + i;
            if(n <= 10000) {
                arr[n] = 1;
            }
        }

        for(int i = 1; i <= 10000; i++) {
            if(arr[i] == 0) {
                bw.write(i + "\n");
            }
        }

        bw.close();
    }

    public static int d(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
