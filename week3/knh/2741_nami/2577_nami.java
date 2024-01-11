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
        int result =1;
        for (int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            result *= n;
        }

        String fin =Integer.toString(result);
        int[] num = new int[10];
        for (int i=0; i<fin.length(); i++){
            num[fin.charAt(i)-'0']++;
        }
        for (int i=0; i<10; i++){
            System.out.println(num[i]);
        }
    }
}
