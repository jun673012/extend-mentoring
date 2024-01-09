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
        int a = Integer.parseInt(st.nextToken());
        int grade = a/10;
        switch(grade){
            case 9:
            case 10:
                bw.write("A");
                break;
            case 8:
                bw.write("B");
                break;
            case 7:
                bw.write("C");
                break;
            case 6:
                bw.write("D");
                break;
            default:
                bw.write("F");
        }
        bw.close();
    }
}
