import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = a*b*c;

        String str = Integer.toString(d);
        
        int[] n = new int[10];
        String num ="0123456789";

        for(int i=0; i<10; i++){
            n[i]=0;
        }
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<num.length(); j++)
            if(str.charAt(i)==num.charAt(j)){
                n[j] += 1;
            }
        }
         for(int i=0; i<10; i++){
             System.out.println(n[i]);
         }
    }
}
