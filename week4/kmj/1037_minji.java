import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        long[] num = new long[a];

        for(int i=0; i<a; i++){
            long b = input.nextLong();
            num[i] = b;
        }
        Arrays.sort(num);
        System.out.print(num[0]*num[a-1]);
    }
}
