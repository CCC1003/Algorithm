package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-22 16:44
 */
public class P2615 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        int[][] arr=new int[n][n];
        int last_x=0,last_y=n/2;
        arr[0][last_y]=1;
        for (int i=2;i<=n*n;i++){
            if(last_x==0&&last_y!=n-1){
                last_x=n-1;
                last_y++;
            }else if(last_x!=0&&last_y==n-1){
                last_x--;
                last_y=0;
            }else if(last_x==0&&last_y==n-1){
                last_x++;
            }else if(last_x!=0&&last_y!=n-1){
                if (arr[last_x-1][last_y+1]==0){
                    last_x--;
                    last_y++;
                }else{
                    last_x++;
                }
            }
            arr[last_x][last_y]=i;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
