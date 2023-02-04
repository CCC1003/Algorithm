package _5;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-26 20:31
 */
public class P1597 {
    static String a="0",b="0",c="0";
    //改值
    static void judgeHead(String head,String val){
        switch (head){
            case "a":
                a=judgeVal(val);
                break;
            case "b":
                b=judgeVal(val);
                break;
            case "c":
                c=judgeVal(val);
                break;
        }
    }
            //拿值
    private static String judgeVal(String val) {
        switch (val){
            case "a":
                return a;
            case "b":
                return b;
            case "c":
                return c;
            default:
                return val;
        }
    }
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String[] str=reader.nextLine().split(";");
        for (int i=0;i<str.length;i++){
            String[] arr=str[i].split(":=");
            judgeHead(arr[0],arr[1]);
        }
        System.out.println(a+" "+b+" "+c);
    }
}
