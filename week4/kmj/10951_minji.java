import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String a;
        while((a = input.readLine()) != null){
            String[] str = a.split(" ");

            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);
            
            System.out.println(num1+num2);
        }
    }
}
