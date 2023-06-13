package knowledge.SlidingWindows;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.LinkedList;

/**
 * @author cong
 * @create 2023-04-30 10:55
 */
public class SlidingWindowMaxArray {
    public static int[] getMaxWindow(int[] arr, int w) {
        if (arr == null || w < 1 || arr.length < w) {
            return null;
        }
        LinkedList<Integer> qmax = new LinkedList<Integer>();
        int[] result = new int[arr.length - w + 1];
        int index = 0;
        for (int R = 0; R < arr.length; R++) {
            //如果队列中右边数小于arr[R]，就让队列弹出直到条件成立
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[R]) {
                qmax.pollLast();
            }
            qmax.addLast(R);
            //随着窗口的更新，队列中数据也更新，前一个窗口的首位置的数不能影响后一个窗口的结果
            if (qmax.peekFirst() == R - w) {
                qmax.pollFirst();
            }
            //取得每个窗口中的最大值
            if (R >= w - 1) {
                result[index++] = arr[qmax.peekFirst()];
            }
        }
        return result;
    }

    //    例如，arr=[4,3,5,4,3,3,6,7]  W = 3
//
//    返回：[5,5,5,4,6,7]
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 4, 3, 3, 6, 7};
        int w = 3;
        int[] r = getMaxWindow(arr, w);
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]+" ");
        }


    }

}
