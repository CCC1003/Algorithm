package _2;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-17 20:09
 */
public class P1888 {
    public static int gad(int a,int b){
        for (int i=a;i>0;i--){
            if(a%i==0&&b%i==0) {
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=reader.nextInt();
        }
        Arrays.sort(arr);
        while(arr[0]*arr[0]+arr[1]*arr[1]!=arr[2]*arr[2]){
            for(int i=0;i<arr.length;i++){
                arr[i]=reader.nextInt();
            }
        }
        int k=gad(arr[0],arr[1]);
        System.out.println(arr[0]/k+"/"+arr[2]/k);
    }
}
