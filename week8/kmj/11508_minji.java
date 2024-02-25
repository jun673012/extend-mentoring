import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(arr, Collections.reverseOrder());

        sum += arr.get(0) + arr.get(1); 
        for(int i=0; i<n/3-1; i++){
            sum += arr.get(i+3) + arr.get(i+4);
        }
        
        if(n%3 == 1)
            sum += arr.get(n-1);
        else if(n%3 == 2)
            sum += arr.get(n-1) + arr.get(n-2);

        System.out.println(sum);
        
    }
}
