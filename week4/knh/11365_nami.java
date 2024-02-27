import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
         while (true){
            line = br.readLine();
            if(line.equals("END")){
                break;
            }
            StringBuffer Bline = new StringBuffer(line);

            String rline = Bline.reverse().toString();
            System.out.println(rline);
        }
    }
}
