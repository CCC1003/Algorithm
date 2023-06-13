package knowledge.Sort;

/**
 * @author cong
 * @create 2022-02-09 20:45
 */
public class CountSort {
    // only for 0~200 value
    public static void countSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int[] count=new int[max-min+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]-min]++;
        }
        int i = 0;
        for (int j = 0; j < count.length; j++) {
            while (count[j]--> 0) {
                arr[i++] = j+min;
            }
        }
    }
}
