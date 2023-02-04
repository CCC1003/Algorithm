package leetCode.sort;

/**
 * @author cong
 * @create 2022-02-15 19:48
 */
public class _88 {
    //归并
        public void merge(int[] num1,int m,int[] num2,int n){
            int p1=0;
            int p2=0;
            int i=0;
            int[] help=new int[m+n];
            while (p1<m&&p2<n){
                help[i++]=num1[p1]<=num2[p2]?num1[p1++]:num2[p2++];
            }
            while (p1<m){
                help[i++]=num1[p1++];
            }
            while (p2<n){
                help[i++]=num2[p2++];
            }
            for (i=0;i<m+n;i++){
                num1[i]=help[i];
            }
        }
}
