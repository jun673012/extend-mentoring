import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            int start = 0;
            int end = n-1;
            int answer = 0;
            int x = Integer.parseInt(st.nextToken());  

            while(start <= end) {
                int mid = (start + end) / 2;
                if(arr[mid] == x) {
                    answer = 1;
                    break;
                }
                if(arr[mid] > x)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            System.out.println(answer);   
        }
        
    }
}
