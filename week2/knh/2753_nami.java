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
        int year = Integer.parseInt(st.nextToken());
        if (year%400==0){
            System.out.print(1);
        } else if (year%4==0){
            if (year%100!=0){
                System.out.print(1);
            } else{
                System.out.print(0);
            }
        } else {
            System.out.print(0);
        }

        bw.close();
    }
}
