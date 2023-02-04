package knowledge.Sort;

/**
 * @author cong
 * @create 2022-01-18 17:47
 */
public class NetherlandsFlag {
//    荷兰国旗问题
    public  static int[] partition(int[] arr,int l,int r,int p){
        int less=l-1;
        int more=r+1;
        while(l<more){
            if(arr[l]<p){
                swap(arr,++less,l++);
            }else if(arr[l]>p){
                swap(arr,--more,l); //还得换过来看一眼
            }else{
                l++;
            }
        }
        return new int[] { less + 1, more - 1 };
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
