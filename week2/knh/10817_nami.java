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
        st = new StringTokenizer(br.readLine());
        int[] numarray = new int[3];
        numarray[0] = Integer.parseInt(st.nextToken());
        numarray[1] = Integer.parseInt(st.nextToken());
        numarray[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(numarray);
        bw.write(numarray[1]+"");

        bw.close();
    }
}
