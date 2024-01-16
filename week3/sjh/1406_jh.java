import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String s = br.readLine();

        int n = Integer.parseInt(br.readLine());

        Stack<String> a = new Stack<>();
        Stack<String> b = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            a.push(s.substring(i, i + 1));
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String c = st.nextToken();

            if (c.equals("L")) {
                if (!a.isEmpty()) {
                    b.push(a.pop());
                }
            }
            if (c.equals("D")) {
                if (!b.isEmpty()) {
                    a.push(b.pop());
                }
            }
            if (c.equals("B")) {
                if (!a.isEmpty()) {
                    a.pop();
                }
            }
            if (c.equals("P")) {
                String ch = st.nextToken();
                a.push(ch);
            }
        }

        while (!a.isEmpty()) {
            b.push(a.pop());
        }

        while (!b.isEmpty()) {
            bw.write(b.pop());
        }

        bw.close();
    }
}
