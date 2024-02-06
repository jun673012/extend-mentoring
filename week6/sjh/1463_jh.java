import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        for (int i = 2; i < n + 1; i++) {
          arr[i] = arr[i - 1] + 1;
  
          if (i % 2 == 0) {
            arr[i] = Math.min(arr[i], arr[i / 2] + 1);
          }
          if (i % 3 == 0) {
            arr[i] = Math.min(arr[i], arr[i / 3] + 1);
          }
        }
      
        bw.write(arr[n] + "");
        bw.close();
      
	}
}
