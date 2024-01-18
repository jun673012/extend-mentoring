import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuffer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        StringBuffer sa = new StringBuffer(a);
        StringBuffer sb = new StringBuffer(b);

        int ra = Integer.parseInt(sa.reverse().toString());
        int rb = Integer.parseInt(sb.reverse().toString());

        if (ra>rb){
            System.out.print(ra);
        } else{
            System.out.print(rb);
        }
    }
}
