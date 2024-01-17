import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        for(int i=0; i<a; i++){
            String n = input.next();
            String[] arr = n.split(",");
            
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            
            System.out.println(A + B);
        }
    }
}
