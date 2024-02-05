import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] num = new int[301];
        int[] arr = new int[n+1];
      
    
        for(int i=1; i<=n; i++){
            num[i] = Integer.parseInt(br.readLine());

            if(i==1){
                arr[1] = num[1];
            }
            else if(i==2){
                arr[2] = num[1] + num[2];
            }
            else{
                arr[i] = Math.max(num[i]+num[i-1]+arr[i-3], num[i]+arr[i-2]);
            }
        }  
        System.out.print(arr[n]);
	}
}
