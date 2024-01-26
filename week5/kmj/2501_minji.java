import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int j = 0;
        int count = 0;

        for(int i=1; i<n+1; i++){
            if(n%i == 0){
                count++;
                if(count == k){
                    j = i;
                    break;
                }
            }
        }
        System.out.println(j);
    }
}
