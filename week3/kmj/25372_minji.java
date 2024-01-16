import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        for(int i=0; i<a; i++){
            String b = input.next();
            if(b.length()>=6 && b.length()<=9)
                System.out.print("yes\n");
            else
                System.out.print("no\n");
        }
        
    }
}
