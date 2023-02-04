package _3;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-17 21:19
 */
public class P1009 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        BigInteger sum=new BigInteger("0");
        BigInteger m=new BigInteger("1");
        for(int i=1;i<=n;i++){
            m=m.multiply(BigInteger.valueOf(i));
            sum=sum.add(m);
        }
        System.out.println(sum);
    }
}
