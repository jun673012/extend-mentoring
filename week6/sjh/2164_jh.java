import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
      
        int card = Integer.parseInt(br.readLine());

        for (int i = 1; i <= card; i++) {
          queue.offer(i);
        }
      
        while(queue.size() != 1) {
          queue.poll();
          card = queue.poll();
          queue.offer(card);
        }
      
        bw.write(card + "");
        bw.close();
      
	}
}
