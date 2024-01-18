import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         while (true){
            String line = br.readLine();
           //이거 질문게시판 보니 line==null이 있어야한다던데 왜 있어야하는지 모르겠어요
            if(line==null||line.equals("")){
                break;
            }
            ;
            System.out.println(line);

        }
    }
}
