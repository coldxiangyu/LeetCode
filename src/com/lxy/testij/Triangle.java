package com.lxy.testij;
import java.util.Scanner;

/**
 * Created by coldxiangyu on 2017/5/11.
 */
public class Triangle {
    public static void printTriangle(){
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        int[] a = new int[lines + 1];  //this place is very important    because a[0] = 0;
        int previous = 1;
        for (int i = 1; i <= lines; i ++){
            for (int j = 1; j <= i; j++){
                int current = a[j];
                a[j] = previous + current;
                previous = current;
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printTriangle();
    }
}
