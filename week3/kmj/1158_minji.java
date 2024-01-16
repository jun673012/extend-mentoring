import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];
        int size = n;
        int index = k;
        
        for(int i=1; i<n+1; i++)
            num.add(i);

        for(int i=0; i<n; i++){
            arr[i] = num.get(index-1);
            num.remove(index-1);
            index += (k-1);
            size--;

            if(size != 0){
                while(index> size){
                    index -= size;
                }
            } 
        }
        System.out.print("<");
        for(int i=0; i<n; i++){
            if(i==0)
                System.out.print(arr[i]);
            else
                System.out.print(", "+arr[i]);
        }
        System.out.print(">");
    }
}
