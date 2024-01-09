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
        int sum_odd=0;
        int odd = 100;
        int n;
        for (int i=0; i<7; i++){
            st = new StringTokenizer(br.readLine());
            n=Integer.parseInt(st.nextToken());
            if (n%2!=0){
                sum_odd+=n;
                if(n<odd){
                    odd=n;
                }
            }
        }

        if(odd!=100){
            System.out.print(sum_odd+"\n"+odd);
        } else{
            System.out.print(-1);
        }
    }
}
