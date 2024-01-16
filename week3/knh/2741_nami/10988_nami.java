import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.lang.StringBuffer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        String org = st.nextToken();
        StringBuffer A = new StringBuffer(org);
        String orgrev = A.reverse().toString();

        if (org.equals(orgrev)){
            bw.write("1"+"");
        } else{
            bw.write("0"+"");
        }
        bw.close();
    }
}
