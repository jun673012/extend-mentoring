import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        StringBuffer sb = new StringBuffer(str);
		String str2 = sb.reverse().toString();

        if(str2.equals(str))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
