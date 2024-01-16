import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.next();
        int[] num = new int[26];
        String alpha ="abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<26; i++){
            num[i]=0;
        }
        for(int i=0; i<alpha.length(); i++){
            for(int j=0; j<a.length(); j++)
            if(alpha.charAt(i)==a.charAt(j)){
                num[i] += 1;
            }
        }
         for(int i=0; i<26; i++){
             System.out.print(num[i] + " ");
         }
    }
}
