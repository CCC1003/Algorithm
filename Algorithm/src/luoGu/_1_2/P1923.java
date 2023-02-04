package _1_2;

import org.omg.CORBA.IRObject;

import java.io.*;
import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-11 19:55
 */
public class P1923 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in=new StreamTokenizer(br);
        PrintWriter pr=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        in.nextToken();
        int n=(int)in.nval;
        int[] arr=new int[n];
        in.nextToken();
        int k=(int)in.nval;
        for (int i=0;i<n;i++){
            in.nextToken();
            arr[i]=(int)in.nval;
        }
        quickSort(arr,k);
        pr.print(arr[k]);
        pr.flush();
    }
    public static void quickSort(int[] arr,int k){
        if(arr==null||arr.length<2){
            return;
        }
        quickSort(arr,0,arr.length-1,k);
    }
    public static void quickSort(int[] arr,int l,int r,int k){
        int less=l;
        int more=r;
        int mid=arr[less];
        if(l<r){
            while(less<more){
                while (less<more&&arr[more]>=mid){
                    more--;
                }
                if (less<more){
                    arr[less]=arr[more];
                    less++;
                }
                while (less<more&&arr[less]<=mid){
                    less++;
                }
                if(less<more){
                    arr[more]=arr[less]; more--;
                }
            }
//            arr[less]=mid;
            if (less>k){
                quickSort(arr,l,less-1,k);
            }else if(less<k){
                quickSort(arr,less+1,r,k);
            }
        }
    }
}
