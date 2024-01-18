import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        String word = st.nextToken();
        String res = "";

        for(char x : word.toCharArray()){
            if(Character.isUpperCase(x)){
                res+=Character.toLowerCase(x);
            } else{
                res+=Character.toUpperCase(x);
            }
        }

        System.out.print(res);
    }
}
