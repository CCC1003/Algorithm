package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-22 20:17
 */
public class P1554 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int m=reader.nextInt();
        int[] p=new int[10];
        int count=0;
        for (int i=n;i<=m;i++){
            int g=i;
            while (g!=0){
                count=g%10;
                g=g/10;
                switch (count){
                    case 0:p[0]++; break;
                    case 1:p[1]++; break;
                    case 2:p[2]++; break;
                    case 3:p[3]++; break;
                    case 4:p[4]++; break;
                    case 5:p[5]++; break;
                    case 6:p[6]++; break;
                    case 7:p[7]++; break;
                    case 8:p[8]++; break;
                    case 9:p[9]++; break;
                }
            }
        }
        for (int x:p){
            System.out.print(x+" ");
        }
    }
}
