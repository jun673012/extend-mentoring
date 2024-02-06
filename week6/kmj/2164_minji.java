import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<Integer>();
        
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            queue.add(i);
        }

        while(queue.size() > 1){
            queue.poll();

            int a = queue.poll();
            queue.add(a);
        }

        System.out.print(queue.poll());
        
    }
}
