package com.tq.github.sort;

/**
 * @author ：lh
 * @date ：Created in 2020/12/8 23:31
 * @description：选择排序
 */
public class SelectionSort {

    /**
     * 选择排序： 从待排序的数据中选择最小（或者最大）的元素放到序列的起始位置，
     * 然后再继续从待排序的数据中取最大（或最小）放到以已排序的末尾，直到待排序数据为0个。
     * 比较操作：N*(N-1)/2
     * 交换操作：0-(N-1)
     * 赋值操作：0-3(N-1)
     * <p>
     * 时间复杂度为O(n)。最坏情况下仍为O(n^2)
     */

    public static void main(String[] args) {

        int arr[] = {1, 23, 324, 24, 1, 2243, 234234, 2, 45, 6767, 8, 33};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }

        }
        for (int i : arr) {
            System.out.println(i);
        }

    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
