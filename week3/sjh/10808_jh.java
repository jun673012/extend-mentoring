import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }

        String a = br.readLine();

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            bw.write(arr[i] + " ");
        }

        bw.close();
    }
}
