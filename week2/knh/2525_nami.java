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
        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int q = x/60;
        int p = x%60;
        if ((60-M-p)>0){
            M+=p;
            if ((H+q)<24){
                H+=q;
            } else{
                H=H+q-24;
            }
        } else{
            M=M+p-60;
            if ((H+q+1)<24){
                H=H+q+1;
            } else{
                H=H+q-23;
            }
        }
        bw.write(H+" "+M+"");

        bw.close();
    }
}
