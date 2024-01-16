import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int asc = 0;
        int des = 0;
        int[] arr = new int[8];
        
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < 8; i++) {
            if (arr[i] == i + 1) {
                asc++;
            } else if (arr[i] == 8 - i) {
                des++;
            }
        }
        
        if (asc == 8) {
            bw.write("ascending");
        } else if (des == 8) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        bw.close();
    }
}
