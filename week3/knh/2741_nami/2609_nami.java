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
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = a;
        int d = b;
      //파이썬에서 배웠떤 유클리드 호제법을 썼습니다.
        while (d!=0){
            int x = d;
            d = c%d;
            c= x;

        }
        bw.write(c+"\n"+"");
        bw.write((a*b)/c + "");
        bw.close();
    }
}
