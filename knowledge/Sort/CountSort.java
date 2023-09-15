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
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        int[] count = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[j++] = i + min;
            }
        }
    }
}
