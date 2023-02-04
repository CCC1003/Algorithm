package _4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-22 9:45
 */
public class P5727 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner reader=new Scanner(System.in);
        int num=reader.nextInt();
        for (int i=0;;i++){
            if(num==1){
                arr.add(num);
                break;
            }
            if (num%2==0){
                arr.add(num);
                num/=2;
            }else{
                arr.add(num);
                num=num*3+1;
            }
        }
        for (int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
    }
}
