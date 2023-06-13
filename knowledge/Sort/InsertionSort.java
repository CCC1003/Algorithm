package knowledge.Sort;

/**
 * @author cong
 * @create 2022-01-17 16:59
 */
public class InsertionSort {
    //插入排序
    public static void insertionSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0;i<arr.length;i++){ //表示每次从哪个位置进行插入
            for (int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
