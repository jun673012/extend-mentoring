import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        
        for(int i=0; i<a; i++){
            String str = input.next(); 
            int count = 0;
            int sum = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='O'){
                    count++;
                }                    
                else
                    count = 0;
                sum += count;
            }
            System.out.println(sum);
        } 
    }
}
