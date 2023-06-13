package knowledge.Sort;

/**
 * @author cong
 * @create 2022-01-17 17:28
 */
public class BSExist {
    //二分查找
    public static boolean bsExist(int[] arr,int num){
        if (arr==null||arr.length<2){
            return false;
        }
        int L=0;
        int R=arr.length-1;
        int mid=0;
        while(L<R){
            mid=L+((R-L)>>1);
            if(arr[mid]==num){
                return true;
            }else if(arr[mid]>num){
                R=mid-1;
            }else if(arr[mid]<num){
                L=mid+1;
            }
        }
        return arr[mid]==num;
    }
}
