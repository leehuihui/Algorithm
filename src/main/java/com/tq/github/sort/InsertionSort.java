package com.tq.github.sort;

/**
 * @author ：
 * @date ：Created in 2020/12/9 21:28
 * @description：插入排序
 */
public class InsertionSort {


    /**
     * 《插入排序》-- Insertion sort
     * <p>
     * 插入排序，一般也被称为直接插入排序。
     * 插入排序是一种最简单的排序方法，它的基本思想是将一个记录插入到已经排好序的有序表中，从而一个新的、记录数增1的有序表。
     * 在其实现过程使用双层循环，外层循环对除了第一个元素之外的所有元素，内层循环对当前元素前面有序表进行待插入位置查找，并进行移动  。
     * <p>
     * 比较次数：1.....N-1=（N-1+1）*（N-1）=N*(N-1)/2
     * <p>
     * 交换次数：0--------N*(N-1)/2
     *
     */
    public static void main(String[] args) {

        int[] arr = {1, 23, 324, 24, 1, 2243, 234234, 2, 45, 6767, 8, 33};


        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                {
                    swap(arr, j, j - 1);
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }


    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }


}
