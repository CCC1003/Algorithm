package _1_2;



import java.io.*;
import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-12 16:31
 */
public class P2676 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in=new StreamTokenizer(br);
        PrintWriter pr=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        in.nextToken();
        int n=(int)in.nval;
        in.nextToken();
        int b=(int)in.nval;
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            in.nextToken();
            arr[i]=(int)in.nval;
        }
//        for (int x:arr){
//            pr.print(x+" ");
//        }
        quickSort(arr);
//        for (int x:arr){
//            pr.print(x+" ");
//        }
        int sum=0;
        int count=0;
        for (int i=arr.length-1;i>=0;i--){
            sum+=arr[i];
            count++;
            if (sum>=b){
                break;
            }
        }
        pr.print(count);
        pr.flush();
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void quickSort(int[] arr){
        if (arr==null||arr.length<2){
            return;
        }
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int[] arr,int l,int r){
        if (l<r){
            swap(arr,l+(int) (Math.random()*(r-l+1)),r);
            int[] p=partition(arr,l,r);
            quickSort(arr,l,p[0]-1);
            quickSort(arr,p[1]+1,r);
        }
    }
    private static int[] partition(int[] arr, int l, int r) {
        int less=l-1;
        int more=r;
        while (l<more){
            if (arr[l]<arr[r]){
                swap(arr,++less,l++);
            }else if(arr[l]>arr[r]){
                swap(arr,--more,l);
            }else{
                l++;
            }
        }
        swap(arr,more,r);
        return new int[]{less+1,more};
    }
}
