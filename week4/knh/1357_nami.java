import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class proweek1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String m = st.nextToken();

        StringBuffer sn = new StringBuffer(n);
        StringBuffer sm = new StringBuffer(m);

        String rn = sn.reverse().toString();
        String rm = sm.reverse().toString();

        int in = Integer.parseInt(rn);
        int im = Integer.parseInt(rm);

        int result = in + im;

        String sr = Integer.toString(result);
        StringBuffer ar = new StringBuffer(sr);
        int fr = Integer.parseInt(ar.reverse().toString());

        System.out.print(fr);
    }
}
