package _6;

import com.sun.deploy.panel.ITreeNode;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-21 20:49
 */
public class P2415 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int[] arr=new int[31];
        int count=0;
        long sum=0;
        while (reader.hasNext()){
            arr[count]=reader.nextInt();
            sum+=arr[count];
            count++;
        }
        sum*=Math.pow(2,count-1)*sum;
        System.out.println(sum);
    }
}
