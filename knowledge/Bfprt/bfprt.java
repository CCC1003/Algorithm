package knowledge.Bfprt;

import java.util.Random;

/**
 * @author cong
 * @create 2023-06-23 10:29
 */
public class bfprt {
    //在无序数组中找第k小的数
    //方法一，改写快排，概率计算为O（N）k>=1
    public static int minKth1(int[] array,int k) {
        int[] arr=copyArray(array);
        return process1(arr,0,arr.length-1,k-1);
    }
    private static int[] copyArray(int[] array) {
        int[] ans=new int[array.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=array[i];
        }
        return ans;
    }
    // arr 第k小的数
    // process2(arr, 0, N-1, k-1)
    // arr[L..R]  范围上，如果排序的话(不是真的去排序)，找位于index的数
    // index [L..R]
    private static int process1(int[] arr, int L, int R, int index) {
        if(L==R) {
            return arr[L];
        }
        int pivot = arr[L+(int)(Math.random()*(R-L+1))];
        int[] range=partition(arr,L,R,pivot);
        if (index>=range[0]&&index<=range[1]) {
            return arr[index];
        } else if (index < range[0]) {
            return process1(arr,L,range[0]-1,index);
        }else {
            return process1(arr,L+1,R,index);
        }
    }

    private static int[] partition(int[] arr, int L, int R, int pivot) {
        int less=L-1;
        int more=R+1;
        int cur=L;
        while (cur<more){
            if (arr[cur]<pivot){
                swap(arr,++less,cur++);
            }else if (arr[cur]>pivot){
                swap(arr,cur,--more);
            }else {
                cur++;
            }
        }
        return new int[]{less+1,more-1};
    }

    private static void swap(int[] arr, int i1, int i2) {
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
    //方法二 采用bfprt算法，时间复杂度严格证明O(N)
    // 利用bfprt算法，时间复杂度O(N)
    public static int minKth2(int[] array, int k) {
        int[] arr = copyArray(array);
        return bfprt(arr, 0, arr.length - 1, k - 1);
    }

    // arr[L..R]  如果排序的话，位于index位置的数，是什么，返回
    public static int bfprt(int[] arr, int L, int R, int index) {
        if (L == R) {
            return arr[L];
        }
        // L...R  每五个数一组
        // 每一个小组内部排好序
        // 小组的中位数组成新数组
        // 这个新数组的中位数返回
        int pivot = medianOfMedians(arr, L, R);
        int[] range = partition(arr, L, R, pivot);
        if (index >= range[0] && index <= range[1]) {
            return arr[index];
        } else if (index < range[0]) {
            return bfprt(arr, L, range[0] - 1, index);
        } else {
            return bfprt(arr, range[1] + 1, R, index);
        }
    }

    // arr[L...R]  五个数一组
    // 每个小组内部排序
    // 每个小组中位数领出来，组成marr
    // marr中的中位数，返回
    public static int medianOfMedians(int[] arr, int L, int R) {
        int size = R - L + 1;
        int offset = size % 5 == 0 ? 0 : 1;
        int[] mArr = new int[size / 5 + offset];
        for (int team = 0; team < mArr.length; team++) {
            int teamFirst = L + team * 5;
            // L ... L + 4
            // L +5 ... L +9
            // L +10....L+14
            mArr[team] = getMedian(arr, teamFirst, Math.min(R, teamFirst + 4));
        }
        // marr中，找到中位数
        // marr(0, marr.len - 1,  mArr.length / 2 )
        return bfprt(mArr, 0, mArr.length - 1, mArr.length / 2);
    }

    public static int getMedian(int[] arr, int L, int R) {
        insertionSort(arr, L, R);
        return arr[(L + R) / 2];
    }
    public static void insertionSort(int[] arr, int L, int R) {
        for (int i = L + 1; i <= R; i++) {
            for (int j = i - 1; j >= L && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

}
