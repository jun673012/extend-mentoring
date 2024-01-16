import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int[][] room = new int[2][7];
        int count = 0;
        
        for(int i=0; i<a; i++){
            int s = input.nextInt();
            int g = input.nextInt();
            room[s][g]++;
        }
        for(int i=0; i<2; i++){
            for(int j=1; j<7; j++){
                count += room[i][j] / b;
                if(room[i][j]%b !=0){
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}

#진짜 모르겠어서 구글링 했는데 코드 이해를 못하겠어요...
