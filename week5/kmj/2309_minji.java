import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();
        int sum = 0;
        int a = 0;
        int b = 0;
        
        for(int i=0; i<9; i++){
            num.add(input.nextInt());
            sum += num.get(i);
        }

         Collections.sort(num);

        for (int i = 0; i < 8; i++){
            for (int j = i + 1; j < 9; j++){
                if (sum - num.get(i) - num.get(j) == 100){
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        for(int i=0; i<9; i++){
            if((i != a) && (i != b)){
                System.out.println(num.get(i));
            }
        }
        
    }
}
