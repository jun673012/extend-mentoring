import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int n1 = 1;
        int k1 = 1;
        int n_k = 1;

        for(int i=1; i<=n; i++)
            n1 *= i;
        for(int i=1; i<=k; i++)
            k1 *= i;
        for(int i=1; i<=n-k; i++)
            n_k *= i;

        System.out.print(n1/(k1*n_k));
    }
}
