package _3;

import com.sun.org.apache.bcel.internal.generic.IFGE;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-18 21:08
 */
public class P5723 {
    // 埃拉托斯特尼筛法(埃式筛法)
    //给出要筛数值的范围n，找出以内的素数。先用2去筛，即把2留下，把2的倍数剔除掉；再用下一个质数，
    // 也就是3筛，把3留下，把3的倍数剔除掉；接下去用下一个质数5筛，把5留下，把5的倍数剔除掉；
    // 不断重复下去......。
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int L=reader.nextInt();
        int[] arr=new int[L+1];
        int pNum=0,sum=0;
        int[] p=new int[L+1];
        for (int i=2;i<L+1-sum;i++){  //条件还可以写成i+sum<=L
            //p数组中标记为0的是素数
            //为1的为合数
            if(p[i]==0){
                arr[pNum++]=i;
                sum+=i;
                for(int j=i+i;j<L+1-sum;j+=i){  //条件还可以写成j+sum<=L
                    p[j]=1;
                }
            }
        }
        for (int i=0;i<pNum;i++){
            System.out.println(arr[i]);
        }
        System.out.println(pNum);
    }
}
