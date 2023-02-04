package _6;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-21 20:02
 */
class Main {
    int id;
    int sn;
    int hn;
    int sum;
    double aSum;
    public  Main(int id,int sn,int hn) {
        this.id=id;
        this.hn=hn;
        this.sn=sn;
        this.sum=hn+sn;
        this.aSum=sn*0.7+hn*0.3;
    }
    public void checkE(){
        if (this.sum>140&&this.aSum>=80){
            System.out.println("Excellent");
        }else{
            System.out.println("Not excellent");
        }
    }
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        Main[] students=new Main[n];
        for (int i=0;i<students.length;i++){
            int id=reader.nextInt();
            int sn=reader.nextInt();
            int hn=reader.nextInt();
            students[i]=new Main(id,sn,hn);
        }
        for (int i=0;i<students.length;i++){
            students[i].checkE();
        }
    }
}
