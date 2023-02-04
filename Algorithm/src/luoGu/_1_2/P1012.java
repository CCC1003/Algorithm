package _1_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-02-14 21:21
 */
public class P1012 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int N=reader.nextInt();
        Integer[] arr=new Integer[N];
        for (int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        Comparator<Integer> comp=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String k1=String.valueOf(o1);
                String k2=String.valueOf(o2);
                for (int i=0;i<k1.length()&&i<k2.length();i++){
                    int f1=k1.charAt(i);
                    int f2=k2.charAt(i);
                    if (f1==f2){
                        continue;
                    }else if(f1<f2){
                        return 1;
                    }else{
                        return -1;
                    }
                }
                if (k1.length()>k2.length()){
                    return k2.charAt(0)-(k1.charAt(k1.length()-1));
                }
                if (k1.length()<k2.length()){
                    return (k2.charAt(k2.length()-1))-k1.charAt(0);
                }
            return 0;}

        };
        Arrays.sort(arr,comp);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
