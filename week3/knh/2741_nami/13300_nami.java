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
        int y = Integer.parseInt(st.nextToken());
        int[] boys = new int[6];
        int[] girls = new int[6];

        for (int i=0; i<x; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 1) {
                boys[m-1]++;
            } else{
                girls[m-1]++;
            }
        }
        int count=0;
        for (int i=0; i<6; i++){
            count+=(girls[i]/y)+(boys[i]/y);
            if ((girls[i]%y)!=0){
                count++;
            }
            if(boys[i]%y!=0){
                count++;
            }
        }
        System.out.print(count);
    }
}
