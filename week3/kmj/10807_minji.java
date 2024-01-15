import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int[] num = new int[a];
        int count = 0;
        for(int i=0; i<a; i++){
            num[i] = input.nextInt();
        }
        int b = input.nextInt();

        for(int i=0; i<a; i++){
            if(num[i]==b)
                count++;
        }

        System.out.print(count);
    }
}
