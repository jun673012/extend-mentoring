import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] numbers = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            numbers[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);
        System.out.printf("%d %d", numbers[0], numbers[n-1]);
    }
}
