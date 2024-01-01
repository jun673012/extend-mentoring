import java.util.Scanner;

# 이 숫자들의 범위는 1 ≤ A, B, C ≤ 10¹² 이므로 int형을 쓰면 틀리기 때문에 long형으로 입력받아야 한다.
  
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        
        System.out.println(a+b+c);
    }
}
