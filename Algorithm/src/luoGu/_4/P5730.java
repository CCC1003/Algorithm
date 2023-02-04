package _4;

import com.sun.media.sound.SoftTuning;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Redefinable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-22 17:03
 */
public class P5730 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(reader.readLine());
      String a=reader.readLine();
      char[] b=a.toCharArray();
        String s0 [] = {"XXX","X.X","X.X","X.X","XXX"};
        String s1 [] = {"..X","..X","..X","..X","..X"};
        String s2 [] = {"XXX","..X","XXX","X..","XXX"};
        String s3 [] = {"XXX","..X","XXX","..X","XXX"};
        String s4 [] = {"X.X","X.X","XXX","..X","..X"};
        String s5 [] = {"XXX","X..","XXX","..X","XXX"};
        String s6 [] = {"XXX","X..","XXX","X.X","XXX"};
        String s7 [] = {"XXX","..X","..X","..X","..X"};
        String s8 [] = {"XXX","X.X","XXX","X.X","XXX"};
        String s9 [] = {"XXX","X.X","XXX","..X","XXX"};
        for (int i=0;i<5;i++){
            for (int j=0;j<n;j++){
                int t=b[j]-48;
                switch(t) {
                    case 0:
                        System.out.print(s0[i]);
                        if(j!=n-1) {
                            System.out.print(".");
                        }
                        continue;
                    case 1:
                        System.out.print(s1[i]);
                        if(j!=n-1) {
                            System.out.print(".");
                        }
                        continue;
                    case 2:
                        System.out.print(s2[i]);
                        if(j!=n-1) {
                            System.out.print(".");
                        }
                        continue;
                    case 3:
                        System.out.print(s3[i]);
                        if(j!=n-1) {
                            System.out.print(".");
                        }
                        continue;
                    case 4:
                        System.out.print(s4[i]);
                        if(j!=n-1) {
                            System.out.print(".");

                        }
                        continue;
                    case 5:
                        System.out.print(s5[i]);
                        if(j!=n-1) {
                            System.out.print(".");
                        }
                        continue;
                    case 6:
                        System.out.print(s6[i]);
                        if(j!=n-1) {
                            System.out.print(".");
                        }
                        continue;
                    case 7:
                        System.out.print(s7[i]);
                        if(j!=n-1) {
                            System.out.print(".");
                        }
                        continue;
                    case 8:
                        System.out.print(s8[i]);
                        if(j!=n-1) {
                            System.out.print(".");
                        }
                        continue;
                    case 9:
                        System.out.print(s9[i]);
                        if(j!=n-1) {
                            System.out.print(".");
                        }
                        continue;
                }
            }
            System.out.println();
        }
    }
}
