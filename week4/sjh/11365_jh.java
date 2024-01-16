import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringBuilder enc = new StringBuilder(br.readLine());

            if(enc.toString().equals("END")) {
                break;
            }

            bw.write(enc.reverse() + "\n");
        }

        bw.close();
    }
}
