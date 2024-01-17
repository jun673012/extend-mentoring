import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int[] num = new int[a];

        for(int i=0; i<a; i++){
            num[i] = input.nextInt();
        }

        Arrays.sort(num);
        System.out.print(num[0]+" "+num[a-1]);
    }
}
