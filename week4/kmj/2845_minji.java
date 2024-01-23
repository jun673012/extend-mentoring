import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        for(int i=0; i<5; i++){
            int c = input.nextInt();

            System.out.print(c-(a*b)+" ");
        }
    }
}
