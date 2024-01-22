import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = 1000-a;
        int count = 0;
        int[] m = {500, 100, 50, 10, 5, 1};

        for(int i=0; i<m.length; i++){
            count += b/m[i];
            b = b%m[i];
        }
        
        System.out.print(count);
    }
}
