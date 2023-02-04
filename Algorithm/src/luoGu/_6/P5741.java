package _6;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-21 19:48
 */
public class P5741 {
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
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                //Math.abs()绝对值函数
                if (Math.abs(cg[i]-cg[j])<=5&&Math.abs(mg[i]-mg[j])<=5&&Math.abs(eg[i]-eg[j])<=5&&
                        Math.abs(cg[i]+mg[i]+eg[i]-cg[j]-mg[j]-eg[j])<=10){
                    System.out.println(name[i]+" "+name[j]);
                }
            }
        }
    }
}
