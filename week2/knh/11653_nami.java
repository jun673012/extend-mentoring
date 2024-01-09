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
        int n = Integer.parseInt(st.nextToken());
        int m = n;
        for(int i=2;i<m+1;i++){
            for (int j=2; j<m+1; j++){
                if (m % j == 0) {
                    System.out.println(j);
                    m=m/j;
                    break;

                }
            }
        }

        if (m!=1){
            System.out.println(m);
        }

        bw.close();
    }
}
