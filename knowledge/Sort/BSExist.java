package knowledge.Sort;

/**
 * @author cong
 * @create 2022-01-17 17:28
 */
public class BSExist {
    //二分查找 有序数组中找一个数是否存在
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
    //有序数组中，找>=某个数最左侧的位置
    public static int nearestIndex(int[] arr, int value) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1;
        while (L < R) {
            int mid = L + ((R - L) >> 1);
            if (arr[mid] >= value) {
                index = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return index;
    }
    //题目：在一个无序数组中，相邻的数肯定不相等。求任意一个局部最小数。
    //要求时间复杂度好于O（N）
    public static int getLessIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // no exist
        }
        if (arr.length == 1 || arr[0] < arr[1]) { //左侧局部最小
            return 0;
        }
        if (arr[arr.length - 1] < arr[arr.length - 2]) {//右侧局部最小
            return arr.length - 1;
        }
        //中间局部最小
        int left = 1;
        int right = arr.length - 2;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
