import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        bw.write("<");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k - 1; j++) {
                queue.add(queue.poll());
            }
            bw.write(queue.poll() + "");
            if (!queue.isEmpty()) {
                bw.write(", ");
            }
        }

        bw.write(">");
        bw.close();
    }
}
