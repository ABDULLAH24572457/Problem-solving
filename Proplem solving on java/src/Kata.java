import java.math.BigInteger;

public class Kata {
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        BigInteger x= BigInteger.valueOf(10);
        BigInteger result=n1.modPow(n2,x);

        return result.intValue();
    }
}