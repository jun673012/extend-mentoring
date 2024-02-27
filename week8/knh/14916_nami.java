import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int num = 0;
        if(N==1 || N==3){
            System.out.print(-1);
            System.exit(0);
        }
        num+=N/5;
        N=N%5;
        if(N%2==0){
            num+=N/2;
        } else{
            N+=5;
            num=num-1;
            num+=N/2;
        }
        System.out.print(num);
    }
}
