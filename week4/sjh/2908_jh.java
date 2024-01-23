import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class main {
    public static void Main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int aNum = 0;
        int bNum = 0;

        while (a != 0 || b != 0) {
            aNum = aNum * 10 + a % 10;
            bNum = bNum * 10 + b % 10;
            a /= 10;
            b /= 10;
        }

        if (aNum > bNum) {
            bw.write(aNum + "");
        } else {
            bw.write(bNum + "");
        }

        bw.close();
    }
}
