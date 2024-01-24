import java.math.BigInteger;
import java.util.Scanner;

public class WhereIn {

    static void where(BigInteger n) {
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);
        boolean looking = true;
        int i = 3;

        if (n.equals(BigInteger.valueOf(0))) {
            System.out.println("1");
            looking = false;
        }
        if (n.equals(BigInteger.valueOf(1))) {
            System.out.println("2");
            looking = false;
        }
        while(looking)  {

            BigInteger num3 = (num1.multiply(BigInteger.valueOf(3))).add((num2.multiply(BigInteger.valueOf(2))));
            num1 = num2;
            num2 = num3;
            if(num3.equals(n)) {
                System.out.println(i);
                looking = false;
            }
            else if(num3.compareTo(n) > 0) {
                System.out.println(i - 1);
                looking = false;
            }
            i++;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number you would like to search for.");
        BigInteger n = scan.nextBigInteger();
        where(n);
    }
}
