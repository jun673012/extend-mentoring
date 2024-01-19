import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String[] str = a.split(" ");
        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<str.length; i++){
            int b =Integer.parseInt(str[i]);
            if(b == (i+1)){
                count1++;
            }
            if(b == 8-i)
                count2++;
        }

        if(count1 == 8){
            System.out.print("ascending");
        }
        else if(count2 ==8){
            System.out.print("descending");
        }
        else
            System.out.print("mixed");
    }
}
