package _1_2;
import java.io.*;
public class P1177 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in=new StreamTokenizer(br);
        PrintWriter pr=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        in.nextToken();
        int n=(int)in.nval;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            in.nextToken();
            arr[i]=(int)in.nval;
        }
    }
    private static void quickSort(int[] arr){
        if(arr==null||arr.length<2){
            return ;
        }
        quickSort(arr,0,arr.length-1);
    }
    private static void quickSort(int[] arr,int l,int r){
        if(l<r){
            swap(arr,l+(int)(Math.random()*(r-l+1)),r);
            int[] p=partition(arr,l,r);
            quickSort(arr,l,p[0]-1);
            quickSort(arr,p[1]+1,r);
        }
    }
    private static int[] partition(int[] arr,int l,int r){
        int less=l-1;
        int more=r;
        while(l<more){
            if(arr[l]<arr[r]){
                swap(arr,++less,l++);
            }
            else if(arr[l]>arr[r]){
                swap(arr,--more,l);
            }
            else{
                l++;
            }
        }
        swap(arr,more,r);
        return new int[]{less+1,more};
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}