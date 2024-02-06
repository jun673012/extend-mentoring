import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int n = input.nextInt();
        int count = 0;
        while(n>0){
            if(n % 5 == 0){
                count += n/5;
                break;
            }
            else if(n < 3){
                count = -1;
                break;
            }
            n -= 3;
            count += 1;
            
        }
        System.out.print(count);
    }
}
