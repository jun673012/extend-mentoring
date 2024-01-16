import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int count = 0;
        
        for(int i=0 ; i<a; i++){
            int b = input.nextInt();

            if (b==1){
                count += 0;
                continue;
            }
            int count2 = 0;
            for(int j=2; j<b; j++){
                if(b%j == 0)
                    count2++;
            }
            if(count2 == 0)
                count++;

        }
        System.out.print(count);
    }
}
