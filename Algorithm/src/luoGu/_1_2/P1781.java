package _1_2;



import java.io.*;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author cong
 * @create 2022-02-12 15:28
 */
public class P1781 {
    public static void main(String[] args) throws IOException {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        TreeMap<BigInteger,Integer> tm=new TreeMap<>(Comparator.reverseOrder());
        for (int i=1;i<=n;i++){
            tm.put(new BigInteger(reader.next()),i);
        }
//        java.util.TreeMap类的comparator()方法用于返回用于对该映射中的键进行排序的比较器；
//        如果此映射使用其键的自然顺序，则返回null。
        int count=0;
        for (Map.Entry entry:tm.entrySet()){
         if (count==1){
                break;
            }
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());

            count++;
        }
    }
}
