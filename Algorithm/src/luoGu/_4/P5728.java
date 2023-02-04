package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-22 10:32
 */
public class P5728 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int N=reader.nextInt();
        int[] ag=new int[N];
        int[] mg=new int[N];
        int[] eg=new int[N];
        for (int i=0;i<N;i++){
            ag[i]=reader.nextInt();
            mg[i]=reader.nextInt();
            eg[i]=reader.nextInt();
        }
        int sum=0;
        for (int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){
                if ((Math.abs(ag[i]-ag[j])<=5)&&(Math.abs(mg[i]-mg[j])<=5)&&(Math.abs(eg[i]-eg[j])<=5)&&
                        (Math.abs(ag[i]+mg[i]+eg[i]-ag[j]-mg[j]-eg[j]))<=10){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
