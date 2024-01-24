import java.math.BigInteger;
import java.util.*;
public class NotFibonacci {

    static void nf(int n) {
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);

        for (int i = 0; i < n; i++) {
            System.out.println(num1 + ", ");
            BigInteger num3 = (num1.multiply(BigInteger.valueOf(3))).add((num2.multiply(BigInteger.valueOf(2))));
            num1 = num2;
            num2 = num3;
        }
    }
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("How many terms of the NotFibonacci Sequence would you like?");
            int n = scan.nextInt();
            NotFibonacci.nf(n);
        }
    }

