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

        int[] numarr = new int[3];
        for (int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            numarr[i]+=Integer.parseInt(st.nextToken());
            numarr[i]+=Integer.parseInt(st.nextToken());
            numarr[i]+=Integer.parseInt(st.nextToken());
            numarr[i]+=Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<3; i++){
            switch(numarr[i]){
                case 0:
                    System.out.println("D");
                    break;
                case 1:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("E");
                    break;

            }
        }

    }
}
