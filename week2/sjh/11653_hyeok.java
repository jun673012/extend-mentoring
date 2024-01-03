import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int divNum = 2;

        while(n != 1) {
            if (n % divNum == 0) {
                n /= divNum;
                bw.write(divNum + "\n");
            } else {
                divNum++;
            }
        }

        bw.flush();
    }
}
