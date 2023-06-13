package knowledge.SlidingWindows;

import java.util.LinkedList;

/**
 * @author cong
 * @create 2023-04-30 15:55
 */
public class AllLessNumSubArray {
    // 暴力的对数器方法
    public static int right(int[] arr, int sum) {
        if (arr == null || arr.length == 0 || sum < 0) {
            return 0;
        }
        int N = arr.length;
        int count = 0;
        for (int L = 0; L < N; L++) {
            for (int R = L; R < N; R++) {
                int max = arr[L];
                int min = arr[L];
                for (int i = L + 1; i <= R; i++) {
                    max = Math.max(max, arr[i]);
                    min = Math.min(min, arr[i]);
                }
                if (max - min <= sum) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int num(int[] arr,int sum) {
        if (arr==null||arr.length==0||sum<0) {
            return 0;
        }
        int N=arr.length;
        LinkedList<Integer> qmax=new LinkedList<>();
        LinkedList<Integer> qmin=new LinkedList<>();
        int R=0;
        int count=0;
        for (int L = 0; L < N; L++) {
            while (R<N){
                //滑动窗口
                while (!qmax.isEmpty()&&arr[qmax.peekLast()]<=arr[R]) {
                    qmax.pollLast();
                }
                qmax.addLast(R);
                //滑动窗口
                while (!qmin.isEmpty()&&arr[qmin.peekLast()]>=arr[R]) {
                    qmin.pollLast();
                }
                qmin.addLast(R);
                if (arr[qmax.peekFirst()]-arr[qmin.peekFirst()]>sum) {
                    break;
                }else {
                    R++;
                }
            }
            count+=R-L;
            if (qmax.peekFirst()==L) {
                qmax.pollFirst();
            }
            if (qmin.peekFirst()==L) {
                qmin.pollFirst();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,8,6,5};
        int sum=5;
        System.out.println(num(arr,sum));
        System.out.println(right(arr,sum));
    }
}
