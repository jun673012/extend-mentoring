import java.util.Scanner;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        
        System.out.println(a.add(b));
    }
}

// long 보다 큰 수를 쓰려면 BigInteger 을 써야 한다.
// import java.math.BigInteger; 로 따로 import 해야 사용 가능하다.
// "+" : add(BigInteger val) - 더하기
// "-" : subtract(BigInteger val) - 빼기
// "*" : multiply(BigInteger val) - 곱하기
// "/" : divide(BigInteger val) - 나누기
// "%" : remainder(BigInteger val) - 나머지
// 제곱 : pow(int exponent) - n승 (제곱)
