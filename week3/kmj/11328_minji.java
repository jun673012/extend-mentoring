import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();

        for(int i=0; i<a; i++){
            String str1 = input.next();
            char[] chars = str1.toCharArray();
            Arrays.sort(chars);
            str1 = new String(chars);
            
            String str2 = input.next();
            char[] chars2 = str2.toCharArray();
            Arrays.sort(chars2);
            str2 = new String(chars2);

            if(str1.equals(str2))
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
    }
}
