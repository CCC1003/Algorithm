package _1_2;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.regexp.internal.RE;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author cong
 * @create 2022-02-14 19:44
 */
class hke{
    int x;
    int y;
    int z;

    public hke(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
public class P5143 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in=new StreamTokenizer(br);
        PrintWriter pr=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        in.nextToken();
        hke[] hkes=new hke[(int)in.nval];
        for (int i=0;i<hkes.length;i++){
            in.nextToken();
            int x=(int)in.nval;
            in.nextToken();
            int y=(int)in.nval;
            in.nextToken();
            int z=(int)in.nval;
            hkes[i]=new hke(x,y,z);
        }
        Comparator<hke> comp=new Comparator<hke>() {
            @Override
            public int compare(hke o1, hke o2) {
                return o1.z-o2.z;
            }
        };
        Arrays.sort(hkes,comp);
       double sum=0;
        for (int i=0;i< hkes.length-1;i++){
           sum+=Math.sqrt(Math.pow(hkes[i+1].x-hkes[i].x,2)
                   +Math.pow(hkes[i+1].y-hkes[i].y,2)+Math.pow(hkes[i+1].z-hkes[i].z,2));
        }
        pr.printf("%.3f",sum);
        pr.flush();
    }

}
