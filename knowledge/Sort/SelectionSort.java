package knowledge.Sort;

/**
 * @author cong
 * @create 2022-01-17 15:36
 */
public class SelectionSort {
    //选择排序
    public static void selectionSort(int[] arr){
        if(arr==null||arr.length<2){
            return ;
        }
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                minIndex=arr[j]<arr[minIndex]?j:minIndex;
            }
            swap(arr,i,minIndex);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

