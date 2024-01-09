import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] numarr = new int[3];
        numarr[0] = Integer.parseInt(st.nextToken());
        numarr[1] = Integer.parseInt(st.nextToken());
        numarr[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(numarr);
        int price = 0;

        if(numarr[0]==numarr[1] && numarr[1] == numarr[2] && numarr[2] == numarr[0]){
            price = 10000+(numarr[0]*1000);
        } else if(numarr[0]!=numarr[1] && numarr[1] != numarr[2] && numarr[2] != numarr[0]){
            price = (numarr[2]*100);
        } else{
            price = (numarr[1]*100)+1000;
        }

        System.out.print(price);

    }
}
