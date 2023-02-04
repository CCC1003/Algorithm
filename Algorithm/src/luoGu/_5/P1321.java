package _5;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-26 10:53
 */
public class P1321 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String str=reader.nextLine();
        int boyNum=0;
        int girlNum=0;
      for (int i=0;i<str.length()-2;i++){
          if (str.charAt(i)=='b'||str.charAt(i+1)=='o'||str.charAt(i+2)=='y'){
              boyNum++;
          }
      }
        for (int i=0;i<str.length()-3;i++){
            if (str.charAt(i)=='g'||str.charAt(i+1)=='i'||str.charAt(i+2)=='r'||str.charAt(i+3)=='l'){
                girlNum++;
            }
        }
        System.out.println(boyNum);
        System.out.println(girlNum);
    }
}
