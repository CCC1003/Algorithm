package knowledge.Sort;

import static knowledge.Sort.InsertionSort.swap;

/**
 * @author cong
 * @create 2022-01-19 9:11
 */
public class HeapSort {

    public static void heapSort(int[] arr) {
        if (arr == null && arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heatInsert(arr, i);  //把数组调整为大根堆结构
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }
    }

    private static void heatInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    private static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }
}

