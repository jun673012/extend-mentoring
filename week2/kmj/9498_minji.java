import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        if (num>=90)
            System.out.print("A");
        else if (num>=80)
            System.out.print("B");
        else if (num>=70)
            System.out.print("C");
        else if (num>=60)
            System.out.print("D");
        else
            System.out.print("F");
        
    }
}
