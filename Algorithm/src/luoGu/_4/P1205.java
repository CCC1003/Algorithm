package _4;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-25 11:16
 */
public class P1205 {
    static int n;
    static char[][] a = new char[15][15];
    static char[][] b = new char[15][15];
    static char[][] c = new char[15][15];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1;i <= n;i++){
            String tempt = sc.next();
            for(int j = 1;j <= n;j++){
                a[i][j] = tempt.charAt(j-1);
            }
        }
        for(int i = 1;i <= n;i++){
            String tempt = sc.next();
            for(int j = 1;j <= n;j++){
                c[i][j] = tempt.charAt(j-1);
            }
        }
        works();

    }
    static boolean vs(char[][] b,char[][] c){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(b[i][j] != c[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean w1(){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                b[j][n-i+1] = a[i][j];
            }
        }
        return vs(b,c);
    }
    static boolean w2(){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                b[n-i+1][n-j+1] = a[i][j];
            }
        }
        return vs(b,c);
    }
    static boolean w3(){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                b[n-j+1][i] = a[i][j];
            }
        }
        return vs(b,c);
    }
    static boolean w4(){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                b[i][n-j+1] = a[i][j];
            }
        }
        return vs(b,c);
    }
    static boolean w5(){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                b[i][n-j+1] = a[i][j];
            }
        }//先做一次四的操作
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                a[i][j] = b[i][j];
            }
        }//将进行了四操作的数组作为第一步，为下一步再转换做准备
        if(w1() || w2() || w3())return true;
        return false;
    }
    static void works(){
        if(w1()){
            System.out.println(1);
        }else if (w2()){
            System.out.println(2);
        }else if (w3()){
            System.out.println(3);
        }else if (w4()){
            System.out.println(4);
        }else if (w5()){
            System.out.println(5);
        }else if (vs(a,c)){
            System.out.println(6);
        }else {
            System.out.println(7);
        }
    }

}
