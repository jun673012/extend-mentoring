import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] angle = new int[3];
        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            angle[i]=Integer.parseInt(st.nextToken());
        }
        if(angle[0]+angle[1]+angle[2]!=180){
            System.out.print("Error");
        } else if(angle[0]==60&&angle[1]==60&&angle[2]==60){
            System.out.print("Equilateral");
        } else if(angle[0]==angle[1]||angle[1]==angle[2]||angle[2]==angle[0]){
            System.out.print("Isosceles");
        } else{
            System.out.print("Scalene");
        }
    }
}
