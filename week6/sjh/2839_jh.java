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
        int cnt = 0;
      
        while (n >= 0) {
          if (n % 5 == 0) {
            cnt += n / 5;
            break;
          }
          
          n -= 3;
          cnt++;
        }
      
        if (n < 0) {
          bw.write("-1");
        } else {
          bw.write(cnt + "");
        }
      
        bw.close();
      
    }
}
