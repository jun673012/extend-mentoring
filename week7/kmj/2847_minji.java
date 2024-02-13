import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        
        for(int i=n-1; i>0; i--){
            if (arr[i] <= arr[i-1]) {
                while(arr[i] <= arr[i-1]){
                    arr[i-1] -= 1;
                    count += 1;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
