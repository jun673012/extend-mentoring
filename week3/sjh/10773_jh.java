import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        int n = 0;

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        for (int i : stack) {
            sum += i;
        }

        bw.write(sum + "");
        bw.close();
    }
}
