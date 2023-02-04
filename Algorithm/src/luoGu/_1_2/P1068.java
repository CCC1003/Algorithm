package _1_2;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

import java.util.*;

/**
 * @author cong
 * @create 2022-02-13 19:37
 */
class Peo{
    int num;
    int grade;

    public Peo(int num, int grade) {
        this.num = num;
        this.grade = grade;
    }
}
public class P1068 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        Peo[] peos=new Peo[n];
        int pm=(int) Math.floor(reader.nextInt()*1.5);
        for (int i=0;i< peos.length;i++){
            int num=reader.nextInt();
            int grade=reader.nextInt();
            peos[i]=new Peo(num,grade);
        }
        Comparator<Peo> comp=new Comparator<Peo>() {
            @Override
            public int compare(Peo o1, Peo o2) {
                if (o1.grade>o2.grade){
                    return -1;
                }else if(o1.grade==o2.grade){
                    if (o1.num<o2.num){
                        return -1;
                    }else if (o1.num>o2.num){
                        return 1;
                    }
                }else {
                    return 1;
                }
                return 1;
            }
        };
        Arrays.sort(peos,comp);
        int count=0;
       for (int i=0;i<peos.length;i++){
           if (peos[i].grade>=peos[pm-1].grade){
               count++;
           }
       }
        System.out.println(peos[count-1].grade+" "+count);
       for (int i=0;i<count;i++){
           System.out.println(peos[i].num+" "+peos[i].grade);
       }
    }
}
