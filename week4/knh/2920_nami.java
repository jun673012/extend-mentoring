import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] scale = new int[8];
        for(int i=0; i<8; i++){
            scale[i]=Integer.parseInt(st.nextToken());
        }
        String result = "";
        for(int i=0; i<7; i++){
            if(scale[i]+1==scale[i+1])
                result = "ascending";
            else if(scale[i]-1==scale[i+1])
                result = "descending";
            else {
                result = "mixed";
                break;
            }
        }
        System.out.print(result);
    }
}
