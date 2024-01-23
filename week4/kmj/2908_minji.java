import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.next();
        StringBuffer na = new StringBuffer(a);
        String a2 = na.reverse().toString();
        
        String b = input.next();
        StringBuffer nb = new StringBuffer(b);
        String b2 = nb.reverse().toString();

        if(a2.compareTo(b2)>0)
            System.out.print(a2);
        else
            System.out.print(b2);
    }
}
