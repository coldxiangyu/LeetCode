package com.lxy.testij;

/**
 * Created by coldxiangyu on 2016/9/12.
 */
public class MergeSort {
    static int[] a = {1, 4, 5, 8, 20, 22, 33, 44};
    static int[] b = {2, 3, 6, 9};
    private static void merge(){
        int[] k = new int[a.length + b.length];
        int n = 0;
        int i = 0, j = 0;
        while(i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                k[n] = a[i];
                i++;
                n++;
            }else{
                k[n] = b[j];
                j++;
                n++;
            }
        }
        if(a.length > b.length){
            for(int p = i;p < a.length;p++){
                k[n++] = a[p];
            }
        }else{
            for(int a = j;a < b.length;a++){
                k[n++] = b[a];
            }
        }
        for(int m = 0;m < k.length; m++) {
            System.out.print(k[m] + " ");
        }
    }
    private static void merge2(){
        int[] k = new int[a.length + b.length];
        int n = 0, i = 0, j = 0;
        while(i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                k[n++] = a[i++];
            }else{
                k[n++] = b[j++];
            }
        }
        while (i < a.length)
            k[n++] = a[i++];

        while (j < b.length)
            k[n++] = b[j++];
        for(int m = 0;m < k.length; m++) {
            System.out.print(k[m] + " ");
        }
    }


    private static void Merge(int[] array, int low, int mid, int high) {
        int i = low; // i是第一段序列的下标
        int j = mid + 1; // j是第二段序列的下标
        int k = 0; // k是临时存放合并序列的下标
        int[] array2 = new int[high - low + 1]; // array2是临时合并序列

        // 扫描第一段和第二段序列，直到有一个扫描结束
        while (i <= mid && j <= high) {
            // 判断第一段和第二段取出的数哪个更小，将其存入合并序列，并继续向下扫描
            if (array[i] <= array[j]) {
                array2[k++] = array[i++];
            } else {
                array2[k++] = array[j++];
            }
        }

        // 若第一段序列还没扫描完，将其全部复制到合并序列
        while (i <= mid) {
            array2[k++] = array[i++];
        }

        // 若第二段序列还没扫描完，将其全部复制到合并序列
        while (j <= high) {
            array2[k++] = array[j++];
        }

        // 将合并序列复制到原始序列中
        for (k = 0, i = low; i <= high; i++, k++) {
            array[i] = array2[k];
        }
    }

    private static void MergePass(int[] array, int gap, int length) {
        int i = 0;

        // 归并gap长度的两个相邻子表
        for (i = 0; i + 2 * gap - 1 < length; i = i + 2 * gap) {
            Merge(array, i, i + gap - 1, i + 2 * gap - 1);
        }

        // 余下两个子表，后者长度小于gap
        if (i + gap - 1 < length) {
            Merge(array, i, i + gap - 1, length - 1);
        }
    }

    private static int[] sort(int[] list) {
        for (int gap = 1; gap < list.length; gap = 2 * gap) {
            MergePass(list, gap, list.length);
        }
        return list;
    }

    public static void main(String[] args){
        int[] array = {9, 1, 5, 3, 4, 2, 6, 8, 7};
        sort(array);
    }
}
