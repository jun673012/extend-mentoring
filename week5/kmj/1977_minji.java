import java.util.*;
import java.lang.Math;
 
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();
        int min = 10000;
        int sum = 0;
        
        for(int i=m; i<=n; i++){
            if(Math.sqrt(i)%1 == 0){
                if(min > i)
                    min = i;
                sum += i;
            }
        }
        if(sum == 0)
            System.out.print(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
        
    }
}
