import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String a = input.nextLine();
        StringTokenizer st = new StringTokenizer(a, " ");
        int b = st.countTokens();
        System.out.print(b);
    }
}
