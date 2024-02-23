import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        count = n % 5;
    
        if (n == 1 || n == 3)
            System.out.print(-1);
        else if (count % 2 == 0)
            System.out.print(n/5 + count/2);
        else
            System.out.print((n/5 - 1) + (count+5) / 2); 
    }
}

