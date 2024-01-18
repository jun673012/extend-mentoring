import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String line;
         while ((line=br.readLine())!=null){
             st = new StringTokenizer(line);

            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            System.out.println(n+m);
        }
    }
}

//하도 인텔리에서는 오류 떠서 찾아보니 제 코드가 답이랑 별반 다를게 없더라구요... 백준에서는 잘 돌아가요...
