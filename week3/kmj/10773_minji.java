import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        int a = input.nextInt();
        int sum = 0;
        
        for(int i=0; i<a; i++){
            int b = input.nextInt();
            if(b==0)
                num.remove(num.size()-1);
            else
                num.add(b);
        }
        for(int i=0; i<num.size(); i++){
            sum += num.get(i);
        }

        System.out.print(sum);
    }
}
