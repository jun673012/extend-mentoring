import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> queue = new LinkedList<Integer>();

        int back = 0;

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
        
            if(s.equals("push")){
                int a = Integer.parseInt(st.nextToken());
                queue.add(a);
                back = a;
            }
                
            else if(s.equals("pop")){
                if(queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.poll());
            }
            else if(s.equals("size")){
                System.out.println(queue.size());
            }
            else if(s.equals("empty")){
                if(queue.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else if(s.equals("front")){
                if(queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.peek());
            }
            else if(s.equals("back")){
                if(queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(back);
            }
        }
    }
}
