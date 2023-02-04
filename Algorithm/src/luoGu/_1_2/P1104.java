package _1_2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author cong
 * @create 2022-02-14 20:19
 */
class Studenth{
    String name;
    int year;
    int month;
    int day;

    public Studenth(String name, int year, int month, int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
public class P1104 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in=new StreamTokenizer(br);
        PrintWriter pr=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        in.nextToken();
        Studenth[] sths=new Studenth[(int)in.nval];
        for (int i=0;i<sths.length;i++){
            in.nextToken();
            String name=in.sval;
            in.nextToken();
            int year=(int)in.nval;
            in.nextToken();
            int month=(int)in.nval;
            in.nextToken();
            int day=(int)in.nval;
            sths[i]=new Studenth(name,year,month,day);
        }
        Comparator<Studenth> comp=new Comparator<Studenth>() {
            @Override
            public int compare(Studenth o1, Studenth o2) {
                if (o1.year<o2.year){
                    return -1;
                }else if (o1.year==o2.year){
                    if (o1.month<o2.month){
                        return -1;
                    }else if (o1.month==o2.month){
                        if (o1.day<o2.day){
                            return -1;
                        }else if (o1.day==o2.day){
                            return -1;
                        }
                    }
                }
                return 1;
            }
        };
        Arrays.sort(sths,comp);
        for (int i=0;i<sths.length;i++){
            pr.println(sths[i].name);
        }
        pr.flush();
    }
}
