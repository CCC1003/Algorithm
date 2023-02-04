package _1_2;

import com.sun.media.sound.SoftTuning;

import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author cong
 * @create 2022-02-12 9:35
 */
public class P1059 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in=new StreamTokenizer(br);
        PrintWriter pr=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        TreeSet<Integer> hs=new TreeSet<>();
        in.nextToken();
        int n=(int)in.nval;
        for (int i=0;i<n;i++){
            in.nextToken();
            hs.add((int)in.nval);
        }
        System.out.println(hs.size());
        for(Iterator iter = hs.iterator(); iter.hasNext(); ) {
            System.out.print(iter.next()+" ");
               }
          }
    }

