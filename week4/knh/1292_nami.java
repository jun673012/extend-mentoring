import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuffer;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ArrayList<Integer> number = new ArrayList<Integer>();
        int sum = 0;
        int time = 0;

        for (int i=1; i<b+1; i++ ){
            for (int j=i; time<j; time++){
                number.add(j);
            }
            time = 0;
        }

        for (int i=a-1; i<=b-1; i++){
            sum += number.get(i);
        }

        System.out.print(sum);

    }
}
