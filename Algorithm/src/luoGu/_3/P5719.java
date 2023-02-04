package _3;
import java.util.Scanner;
/**
 * @author cong
 * @create 2022-01-17 20:33
 */
public class P5719 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int k=reader.nextInt();
        int sum1=0;
        int x1=0;
        int sum2=0;
        int x2=0;
        for(int i=1;i<=n;i++){
            if(i%k==0){
                sum1+=i;
                x1++;
            }else{
                sum2+=i;
                x2++;
            }
        }
        System.out.printf("%.1f %.1f",((double)sum1/x1),((double)sum2/x2));
    }
}
