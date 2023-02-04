package _1_2;

import java.io.*;

/**
 * @author cong
 * @create 2022-02-12 17:09
 */
public class P1116 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in=new StreamTokenizer(br);
        PrintWriter pr=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        in.nextToken();
        int n=(int)in.nval;
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            in.nextToken();
            arr[i]=(int)in.nval;
        }
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    count++;
                }
            }
        }
        pr.print(count);
        pr.flush();
    }
}
