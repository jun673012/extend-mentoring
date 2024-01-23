import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        String b = input.next();
        String[] str = b.split("");
        int sum = 0;
        
        for(int i=0; i<a; i++){
            sum += Integer.parseInt(str[i]);
        }

        System.out.print(sum);
    }
}
