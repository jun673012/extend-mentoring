import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        for(int i=0; i<a; i++){
            int m = input.nextInt();
            
            int qua = m/25;
            m %= 25;

            int di = m/10;
            m %=10;

            int ni = m/5;
            m %= 5;

            int pe = m/1;

            System.out.println(qua+" "+di+" "+ni+" "+pe);
        }
    }
}
