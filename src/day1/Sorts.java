package day1;

import java.util.Arrays;

public class Sorts {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 58, 12, 657, 857, 654, 54, 1, 5, 2547, 54, 784, 578, 546, 25, 587, 25, 14};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int[] arr, int from, int to) {
        int left = from;
        int right = to;
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[right] > pivot) {
                right--;
            }
            while (arr[left] < pivot) {
                left++;
            }
            if (left <= right) {
                swap(arr, left, right);
                right--;
                left++;
            }
        }
        return left;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int devIndex = partition(arr, start, end);
            quickSort(arr, start, devIndex - 1);
            quickSort(arr, devIndex, end);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
