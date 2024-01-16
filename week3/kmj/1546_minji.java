import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Float> num = new ArrayList<>();
        
        int a = input.nextInt();
        float [] arr = new float[a];
        float sum = 0;
        float max = 0;
        for(int i=0; i<a; i++){
            num.add(input.nextFloat());
            if(num.get(i)>max)
                max = num.get(i);
            
        }
        for(int i=0; i<a; i++){
            arr[i] = (num.get(i)/max)*100;
            sum += arr[i];
        }
        
        System.out.print(sum/a);
    }
}
