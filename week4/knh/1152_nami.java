import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String tline = line.trim();
        if (tline.equals("")){
            System.out.print("0");
            return;
        }
        String[] blank = tline.split(" ");
        System.out.print(blank.length);
    }
}
