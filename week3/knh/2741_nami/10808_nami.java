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
        String line = st.nextToken();
        int[] alpha = new int[26];
        for (int i=0; i<line.length(); i++){
            char x = line.charAt(i);
            alpha[x-'a']++;
        }
        for (int i=0; i<26; i++){
            System.out.printf("%d ", alpha[i]);
        }
    }
}
