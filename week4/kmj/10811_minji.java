import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        int[] box = new int[n];

        for(int q=0; q<n; q++)
            box[q] = q+1;
        for(int l=1; l<m+1; l++){
            int i = input.nextInt();
            int j = input.nextInt();
            while(i<=j){
                int temp = box[i-1];
                box[i-1] = box[j-1];
                box[j-1] = temp;
                i++;
                j--;
            }
        }
        for(int i=0; i<n; i++)
            System.out.print(box[i]+" ");
    }
}
