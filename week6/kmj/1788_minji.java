import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt() + 1000000;

        int[] s = new int[2000001];
        s[1000000] = 0;
        s[1000001] = 1;

        if(n < 1000000) {
            for (int i = 999999; i >= n; i--) {
                s[i] = (s[i+2] - s[i+1]) % 1000000000;
            }
        } 
        else {
            for (int i = 1000002; i <= Math.abs(n); i++) {
                s[i] = (s[i-1] + s[i-2]) % 1000000000;
            }
        }

        if(s[n] > 0)
            System.out.println(1);
        if(s[n] == 0)
            System.out.println(0);
        if(s[n] < 0)
           System.out.println(-1);

        System.out.print(Math.abs(s[n]));
    }
}
