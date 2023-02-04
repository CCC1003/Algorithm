package _6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-20 20:55
 */
public class P5739 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n= reader.nextInt();
        System.out.println(N(n));
    }
    public static int N(int n){
        if (n==1){
            return 1;          // 3*N(2)
                               // N(2)=2*N(1)
        }                      // N(1)=1
        return n*N(n-1);
    }
}
