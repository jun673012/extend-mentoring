import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        for(int i=0; i<a; i++){
            int b = input.nextInt();
            String c = input.next();
            
            for(int j=0; j<c.length(); j++){
                for(int k=0; k<b; k++){
                    System.out.print(c.charAt(j)); //줄 바꿈 x
                }
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
