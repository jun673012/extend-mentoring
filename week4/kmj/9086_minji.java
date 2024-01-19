import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        for(int i=0; i<a; i++){
            String b = input.next();

            char c = b.charAt(0);
            char d = b.charAt(b.length()-1);
            System.out.print(c);
            System.out.print(d+"\n");
        }
    }
}
