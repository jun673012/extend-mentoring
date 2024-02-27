import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] length = new int[3];
        while(true){
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<3; i++){
                length[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(length);
            if(length[0]==0&&length[1]==0&&length[2]==0){
                return;
            }
            if(length[2]*length[2]==(length[0]*length[0])+(length[1]*length[1])){
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
        }
    }
}
