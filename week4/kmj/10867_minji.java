import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        HashSet<Integer> num = new HashSet<Integer>();

        for(int i=0; i<a; i++){
            int b = input.nextInt();
            num.add(b);
        }
        ArrayList<Integer> n = new ArrayList<Integer>(num);
        Collections.sort(n);

        for(int i=0; i<n.size(); i++){
            System.out.print(n.get(i)+" ");
        }   
    }
}
