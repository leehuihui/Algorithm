package com.tq.github.sort;

/**
 * @author ：
 * @date ：Created in 2020/12/10 22:55
 * @description：希尔排序
 */
public class ShellSort {


    /**
     * 希尔排序：是直接插入排序算法的一种更高效的改进版本
     * 先分组 再进行插入排序
     * 升级版的插入排序
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = {1, 23, 324, 24, 1, 2243, 234234, 2, 45, 6767, 8, 33};

        // 这里通常是序列的一半
        int length = arr.length;
        for (int gap = length / 2; gap > 0; gap = gap / 2) {
            // 一共分了N个组 我们对每组进行插入排序
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < length; j = j + gap) {
                    groupSort(arr, gap, i);
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }

    }


    static void groupSort(int[] arr, int gap, int start) {

        for (int i = start + gap; i < arr.length; i = i + gap) {
            for (int j = i; j > gap && j < arr.length && arr[j] < arr[j - gap]; j = j - gap) {
                {
                    swap(arr, j, j - gap);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
