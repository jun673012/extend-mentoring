import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
                    bw.write("-1\n");
                else
                    bw.write(queue.poll() + "\n");
            }
            else if(s.equals("size")){
                bw.write(queue.size() + "\n");
            }
            else if(s.equals("empty")){
                if(queue.isEmpty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
            else if(s.equals("front")){
                if(queue.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(queue.peek() + "\n");
            }
            else if(s.equals("back")){
                if(queue.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(back + "\n");
            }
        }
        bw.close();
    }
}
