package _2;

import java.util.Scanner;

/**
 * @author cong
 * @create 2022-01-14 19:48
 */
public class P5714 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        double m=reader.nextDouble();
        double h=reader.nextDouble();
        while ((m<40||m>120)||(h>2.0||h<1.4)){
            m=reader.nextInt();
            h=reader.nextInt();
        }
        double  w=m/(h*h);
        if(w<18.5){
            System.out.println("Underweight");
        }
        else if(w>=18.5&&w<24){
            System.out.println("Normal");

        }
        else if(w>=24){
            java.text.DecimalFormat  df = new java.text.DecimalFormat("#.0000");
            System.out.println(df.format(w));
            System.out.println("Overweight");
        }

    }
}
