import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] zero = new int[41];
        int[] one = new int[41];

        zero[1] = 0;
        one[0] = 0;
        zero[0] = 1;
        zero[2] = 1;
        one[1] = 1;
        one[2] = 1;
        
    
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());

            if(a>=3){
                for(int j=2; j<=a; j++){
                    zero[j] = zero[j-1] + zero[j-2];
                    one[j] = one[j-1] + one[j-2];
                }
            }

            System.out.println(zero[a] + " " + one[a]);
        }   
	}
}
