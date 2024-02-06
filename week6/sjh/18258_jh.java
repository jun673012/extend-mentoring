import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
          st = new StringTokenizer(br.readLine());

          String c = st.nextToken();

          if (c.equals("push")) {
            queue.add(Integer.parseInt(st.nextToken()));
          }
          if (c.equals("pop")) {
            if (queue.isEmpty()) {
              bw.write("-1\n");
            } else {
              bw.write(queue.poll() + "\n");
            }
          }
          if (c.equals("size")) {
            bw.write(queue.size() + "\n");
          }
          if (c.equals("empty")) {
            if (queue.isEmpty()) {
              bw.write("1\n");  
            } else {
              bw.write("0\n");
            }
          }
          if (c.equals("front")) {
            if (queue.isEmpty()) {
              bw.write("-1\n");
            } else {
              bw.write(queue.peek() + "\n");
            }
          }
          if (c.equals("back")) {
            if (queue.isEmpty()) {
              bw.write("-1\n");
            } else {
              bw.write(queue.peekLast() + "\n");
            }
          }
        }
      
        bw.close();
      
	}
}
