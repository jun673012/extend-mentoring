import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String w = br.readLine();
        StringBuilder res = new StringBuilder();

        for (char c : w.toCharArray()) {
            if (Character.isLowerCase(c)) {
                res.append(Character.toUpperCase(c));
            } else {
                res.append(Character.toLowerCase(c));
            }
        }

        bw.write(res + "");
        bw.close();
    }
}
