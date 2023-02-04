package _2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-17 19:26
 */
public class P1424 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int x=reader.nextInt();
        long n=reader.nextInt();
        long s=0;
        for (int i=0;i<n;i++){
            if(x!=6&&x!=7){
                s+=250;
            }
            if(x==7){
                x=1;
            }else {
                x++;
            }
        }
        System.out.println(s);
    }
}
