import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i= 0; i<n; i++){
            int  a = scanner.nextInt();
            String data = scanner.nextLine();
            data = data.trim();
            for (int j=0; j<data.length(); j++){
                for (int k = 1; k<a+1; k++){
                    System.out.print(data.charAt(j));
                }
            }
            System.out.println("");
        }



    }}
