package _6;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

/**
 * @author cong
 * @create 2022-01-21 11:40
 */
public class P5740 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        String[] name=new String[n];
        int[] cg=new int[n];
        int[] mg=new int[n];
        int[] eg=new int[n];
        for (int i=0;i<n;i++){
                name[i]=reader.next();
                cg[i]=reader.nextInt();
                mg[i]=reader.nextInt();
                eg[i]=reader.nextInt();
        }
        int count=0,sum=0;
        sum=cg[0]+mg[0]+eg[0];
        for (int i=1;i<n;i++){
            sum= Math.max(sum, cg[i] + mg[i] + eg[i]);
        }
        for (int i=0;i<n;i++){
            if (sum==cg[i] + mg[i] + eg[i]){
                count=i;
                break;
            }
        }
        System.out.print(name[count]+" "+cg[count]+" "+mg[count]+" "+eg[count]);
    }
}
