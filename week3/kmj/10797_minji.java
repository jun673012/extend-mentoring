import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int count=0;
        
        for(int i=0; i<5; i++){
            int b = input.nextInt();
            if(a==b)
                count++;
        }
        System.out.print(count);
    }
}
