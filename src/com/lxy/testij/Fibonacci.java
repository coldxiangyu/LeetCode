package com.lxy.testij;

import java.util.Scanner;

/**
 * Created by coldxiangyu on 2017/5/11.
 */
public class Fibonacci {
    //1 1 2 3 5 8 13 21 34 55 89 144...
    public static int fibonacci(int n){
        if(n <= 2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args){
        for(int i = 1; i <= 20; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
