package knowledge.Sort;

import java.util.*;

/**
 * @author cong
 * @create 2022-02-19 20:27
 */
public class BucketSort {
    public static double[] bucketSort(double[] array){
        double max=array[0];
        double min=array[0];
        for (int i=1;i<array.length;i++){
            max=Math.max(max,array[i]);
            min=Math.min(min,array[i]);
        }
        double d=max-min;
        int bucketNum=array.length;
        ArrayList<LinkedList<Double>> bucketList=new ArrayList<LinkedList<Double>>(bucketNum);
        for (int i=0;i<bucketNum;i++){
            bucketList.add(new LinkedList<>());
        }
        for (int i=0;i<array.length;i++){
            int num=(int)((array[i]-min)*(bucketNum-1)/d);
            bucketList.get(num).add(array[i]);
        }
        for (int i=0;i<bucketList.size();i++){
            Collections.sort(bucketList.get(i));
        }
        double[] sortedArray=new double[array.length];
        int index=0;
        for (LinkedList<Double> List:bucketList){
            for (double element:List){
                sortedArray[index]=element;
                index++;
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        double[] array=new double[]{4.12,6.421,0.0023,3.0,2.123,8.122,4.12,10.09};
        double[] sortedArray=bucketSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
