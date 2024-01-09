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
        int[] card = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i=0; i<10; i++){
            st = new StringTokenizer(br.readLine());
            int n =Integer.parseInt(st.nextToken());
            int m =Integer.parseInt(st.nextToken());
            int[] arr = new int[m-n+1];
            for(int j = 0; j<arr.length; j++){
                arr[j]=card[m-j-1];
            }
            for(int j = 0; j<arr.length; j++){
                card[n+j-1]=arr[j];
            }
        }

        for (int i=0; i<20; i++){
            System.out.print(card[i]+" ");
        }
    }
}
