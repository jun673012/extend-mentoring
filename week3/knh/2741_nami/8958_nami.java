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
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            int l = line.length();
            int score=0;
            int fin = 0;
            for (int j=0; j<l; j++){
                if((line.charAt(j))=='O'){
                    score++;
                    fin +=score;
                } else{
                    score = 0;
                }
            }
            System.out.println(fin);
        }
    }
}
