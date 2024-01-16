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
        int x = Integer.parseInt(st.nextToken());
        int[] num = new int[x];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<x; i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i=0; i<x; i++){
            if(num[i]==y){
                count++;
            }
        }
        System.out.print(count);
    }
}
