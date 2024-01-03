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
        int n =Integer.parseInt(st.nextToken());
        int [] call = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            call[i]=Integer.parseInt(st.nextToken());
        }

        int Y = 0;
        int M = 0;

        for (int i=0; i<n; i++){
            Y += ((call[i]/30 + 1)*10);
        }

        for (int i=0; i<n; i++){
            M += ((call[i]/60 + 1)*15);
        }

        if (Y==M){
            System.out.print("Y M "+Y);
        } else if(Y>M){
            System.out.print("M "+M);
        } else{
            System.out.print("Y "+Y);
        }

    }
}
