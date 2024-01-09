import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] num = new int[5];
        int sum=0;
        for (int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            num[i]=Integer.parseInt(st.nextToken());
            sum+=num[i];
        }
        Arrays.sort(num);
        System.out.print(sum/5+"\n"+num[2]);
    }
}
