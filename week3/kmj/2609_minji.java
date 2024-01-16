import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = a*b;

        while (b != 0) {
			    a = a % b;
			    int temp = a;
			    a = b;
			    b = temp;
		    }
        
        System.out.println(a);
        System.out.println(c/a);
    }
}
