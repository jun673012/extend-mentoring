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
        
        int t = Integer.parseInt(br.readLine());
        
        int[] arr = new int[121]; 
        
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 0; i < t; i++) {
          int n = Integer.parseInt(br.readLine());
          for (int j = 4; j < 121; j++) {
            arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
          }
          bw.write(arr[n] + "\n");
        }
      
        bw.close();
      
	}
}
