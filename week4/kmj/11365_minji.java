import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            String a = input.nextLine();
            if(a.equals("END"))
                break;
            StringBuffer sa = new StringBuffer(a);
            String ra = sa.reverse().toString();
            System.out.println(ra);
        }
    }
}
