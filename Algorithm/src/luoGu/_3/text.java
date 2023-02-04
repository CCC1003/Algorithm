package _3;

import jdk.nashorn.internal.ir.IfNode;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-27 8:58
 */
public class text {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n=reader.nextInt();
        int k=reader.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<n;i++){
            arrayList.add(reader.nextInt());
        }
        int sum=0;
        int count=0;
        for(int i=0;i<arrayList.size();i++){
            for(int j=i;j<arrayList.size();j++){
                sum+=arrayList.get(j);

                if(sum%k==0){
                    count++;
                }
                if(j==n-1){
                    sum=0;
                }
            }
        }
        System.out.println(count);
        reader.close();
    }
        }
