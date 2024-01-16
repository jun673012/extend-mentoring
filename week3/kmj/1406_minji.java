import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        Stack leftSt = new Stack<>();
        Stack rightSt = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
			leftSt.push(str.charAt(i));
		}

        for(int i=0; i<n; i++){
        	String c = br.readLine();

            if(c.equals("L")){
                 if (!leftSt.empty()) {
                    rightSt.push(leftSt.pop());
                }
            }
            else if(c.equals("D")){
                if (!rightSt.empty()) {
                    leftSt.push(rightSt.pop());
                }
            }
            else if (c.equals("B")) {
				if (!leftSt.empty()) {
					leftSt.pop();
				}
            }        
            else if(c.contains("P")){
                char a = c.charAt(2);
                leftSt.push(a);
            }
        }
        while (!leftSt.empty()) {
			rightSt.push(leftSt.pop());
		}

		while (!rightSt.empty()) {
			bw.write(rightSt.pop());
		}
        bw.close();
    }
}
