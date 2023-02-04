package dataStructure;

import java.time.temporal.Temporal;
import java.util.Arrays;

/**
 * @author cong
 * @create 2022-02-17 17:54
 */
public class BinaryHeap {
    public static void upAdjust(int[] array){
        int childIndex=array.length-1;
        int parentIndex=(childIndex-1)/2;
        //temp 保存插入的叶子节点值，用于最后的赋值
        int temp=array[childIndex];
        while (childIndex>0&&temp<array[parentIndex]){
            //无需真正交换，单项赋值即可
            array[childIndex]=array[parentIndex];
            childIndex=parentIndex;
            parentIndex=(parentIndex-1)/2;
        }
        array[childIndex]=temp;
    }
    public static void downAdjust(int[] array,int parentIndex,int length){
        //temp保存父节点的值，用于最后的赋值
        int temp=array[parentIndex];
        int childIndex=2*parentIndex+1;
        while (childIndex<length){
            //如果有右孩子，且右孩子小于左孩子的值，则定位到右孩子
            if (childIndex+1<length&&array[childIndex+1]<array[childIndex]){
                childIndex++;
            }
            if (temp<=array[childIndex]){
                break;
            }
            array[parentIndex]=array[childIndex];
            parentIndex=childIndex;
            childIndex=2*childIndex+1;
        }
        array[parentIndex]=temp;
    }
    public static void buildHeap(int[] array){
        for (int i=(array.length-2)/2;i>=0;i--){
            downAdjust(array,i,array.length);
        }
    }

    public static void main(String[] args) {
        int[] array=new int[]{1,3,2,6,5,7,8,9,10,0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));
        int[] array1=new int[]{7,1,3,10,5,2,8,9,6};
        buildHeap(array1);
        System.out.println(Arrays.toString(array1));
    }
}
