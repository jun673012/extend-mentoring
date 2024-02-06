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

        int[][] arr = new int[n+1][n+1];

        for(int i=0; i<=n; i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
        }

        for(int i=2; i<=n; i++){
            for(int j=1; j<i; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        bw.write(String.valueOf(arr[n][k]));
        bw.close();

    }
}
