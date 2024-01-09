import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        while(true){
            int a = input.nextInt();
            int b = input.nextInt();
            if(a==0 & b==0)
                break;
            else if(a>b)
                System.out.print("Yes\n");
            else
                System.out.print("No\n");
                
        }
    }
}
