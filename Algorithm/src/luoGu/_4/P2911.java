package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-24 9:22
 */
public class  P2911 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int s1=reader.nextInt();
        int s2=reader.nextInt();
        int s3=reader.nextInt();
        int[] count=new int[s1+s2+s3+1];
        for (int i=1;i<=s1;i++){
            for (int j=1;j<=s2;j++){
                for (int k=1;k<=s3;k++){
                    int sum=i+j+k;
                    count[sum]++;
                }
            }
        }
        int max=count[0];
        for (int i=0;i<count.length;i++){
            for (int j=i+1;j<count.length;j++){
                max=max>count[j]?max:count[j];
            }
        }
        for (int i=0;i<count.length;i++){
            if (count[i]==max){
                System.out.println(i);
                break;
            }

        }
    }
}
