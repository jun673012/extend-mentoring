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
        int a,b=0;
        do{
            st = new StringTokenizer(br.readLine());
            a =Integer.parseInt(st.nextToken());
            b =Integer.parseInt(st.nextToken());
            if(a==0&&b==0)
                break;
            if(a>b){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
            
        }while(a!=0&&b!=0);
    }
}
