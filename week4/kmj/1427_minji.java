import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String a = input.nextLine();
        int n = a.length();
        Integer[] num = new Integer[n];

        for(int i=0; i<num.length; i++){
            num[i] = a.charAt(i) - '0';
        }
		    Arrays.sort(num, Collections.reverseOrder());

        for(int i : num)
            System.out.print(i);
    }
}
