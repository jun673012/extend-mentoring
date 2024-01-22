import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a=Integer.parseInt(st.nextToken());
            if(numbers.contains(a)!=true){
                numbers.add(a);
            }
        }
        Collections.sort(numbers);
        for(Integer i:numbers){
            System.out.printf("%d ",i);
        }
    }
}
