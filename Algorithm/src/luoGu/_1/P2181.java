package _1;

import javax.sound.midi.Soundbank;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-13 19:47
 */
public class P2181 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        BigInteger n=reader.nextBigInteger();
        BigInteger bi1 = new BigInteger("1");
        BigInteger bi4 = new BigInteger("4");
        BigInteger bi3 = new BigInteger("3");
        BigInteger bi2 = new BigInteger("2");

        BigInteger r1=n.subtract(bi1);
        BigInteger r2=n.subtract(bi2);
        BigInteger r3=n.subtract(bi3);

        BigInteger result=n.multiply(r1.multiply(r2.multiply(r3)))
                .divide(bi1.multiply(bi2.multiply(bi3.multiply(bi4))));

        System.out.println(result);
    }
}
