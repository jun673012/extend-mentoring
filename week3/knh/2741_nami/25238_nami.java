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
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double damage = a*(b/100);
        if ((a-damage)<100){
            System.out.println("1");
        } else{
            System.out.println("0");
        }
    }
}
