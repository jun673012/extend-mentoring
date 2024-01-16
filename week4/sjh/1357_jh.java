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

        String x = st.nextToken();
        String y = st.nextToken();

        StringBuilder sdX = new StringBuilder(x);
        StringBuilder sdY = new StringBuilder(y);

        sdX.reverse();
        sdY.reverse();

        int numX = Integer.parseInt(sdX.toString());
        int numY = Integer.parseInt(sdY.toString());

        StringBuilder sdRes = new StringBuilder(String.valueOf(numX + numY));
        sdRes.reverse();

        if (sdRes.charAt(0) == '0') {
            sdRes.deleteCharAt(0);
        }

        bw.write(Integer.parseInt(sdRes.toString()) + "\n");
        bw.close();
    }
}
