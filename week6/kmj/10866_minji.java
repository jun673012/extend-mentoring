import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> deque = new LinkedList<Integer>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();


            if(s.equals("push_front")){
                int a = Integer.parseInt(st.nextToken());
                deque.addFirst(a);
            }
            else if(s.equals("push_back")){
                int a = Integer.parseInt(st.nextToken());
                deque.add(a);
            }
            else if(s.equals("pop_front")){
                if(deque.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(deque.pollFirst());
            }
            else if(s.equals("pop_back")){
                if(deque.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(deque.pollLast());
            }
            else if(s.equals("size")){
                System.out.println(deque.size());
            }
            else if(s.equals("empty")){
                if(deque.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else if(s.equals("front")){
                if(deque.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(deque.peekFirst());
            }
            else if(s.equals("back")){
                if(deque.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(deque.peekLast());
            }
        }
    }
}
