package knowledge.Sort;


/**
 * @author cong
 * @create 2022-01-17 16:04
 */
public class BubbleSort {
    //冒泡排序
    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp =arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

}
