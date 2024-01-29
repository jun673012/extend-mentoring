import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=1; i<=10000; i++){
            set.add(i);
        }

        for(int i=1; i<=10000; i++){
            set.remove(d(i));
        }

        for(int i : set){
            System.out.println(i);
        }
    }

    public static int d(int n){
        String s = Integer.toString(n);
        int res, sum = n;

        for(int i=0; i<s.length(); i++){
            res = n%10;
            sum += res;
            n = n/10;
        }

        return sum;
        
    }
}
