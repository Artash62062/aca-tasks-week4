package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Arithmetic {
    private final int[] arr;
    private boolean isSorted = false;

    public Arithmetic(int[] arr) {
        this.arr = arr;
    }

    public void options() {
        int opNum;
        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;
        while(isWorking) {
            System.out.println("1-Sort the Array using Bubble Sort\n");
            System.out.println("2-Sort the Array Using Quick Sort\n");
            System.out.println("3-Find The Element Using Binary Search\n");
            System.out.println("4-is array arithmetic progression\n");
            System.out.println("0-for Stop the Program\n");
            opNum = scanner.nextInt();
            switch (opNum) {
                case 1:
                    bubbleSort();
                    break;
                case 2:
                    quickSort();
                    break;
                case 3:
                    System.out.print("input the Number :");
                    int x = scanner.nextInt();
                    int answer = binarySearch(x);
                    if(answer==-1) {
                        System.out.println("404 Not Found\n");
                    } else {
                        System.out.println(answer);
                    }
                    break;
                case 4:
                    if (isArithmetic()) {
                        System.out.println("Array is day1.Arithmetic Progression\n");
                    } else {
                        System.out.println("Array isn't day1.Arithmetic Progression\n");
                    }
                    break;

                case 0:
                    System.out.println("Goodbye\n");
                    isWorking = false;
                    break;
                default:
                    System.out.println("Unknown Command try Again\n");
            }
        }
    }

    public int max() {
        if (!isSorted) {
            quickSort();
        }
        return arr[arr.length - 1];
    }

    public int min() {
        if (!isSorted) {
            quickSort();
        }
        return arr[0];
    }

    public int average() {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }

    public void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
        isSorted = true;
    }


    private void swap(int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private int partition(int from, int to) {
        int rightIndex = to;
        int leftIndex = from;
        int pivot = arr[(from + to) / 2];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public void quickSort(int from, int to) {
        if (from < to) {
            int divideIndex = partition(from, to);
            quickSort(from, divideIndex - 1);
            quickSort(divideIndex, to);
        }
        isSorted = true;
    }

    public void quickSort() {
        quickSort(0, arr.length - 1);
    }


    public String toString() {
        return Arrays.toString(this.arr);
    }

    public int binarySearch(int x) {
       return binarySearch(0, arr.length - 1, x);
    }

    public int binarySearch( int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(l, mid - 1, x);

            return binarySearch(mid + 1, r, x);
        }

        return -1;
    }

    private boolean isArithmetic () {
        if(!isSorted) {
            quickSort();
        }
        int diff = arr[1]-arr[0];
        int diffSec ;
        for (int i = 0; i < arr.length-1; i++) {
            diffSec = arr[i+1] - arr[i];
            if(diffSec!=diff) {
                return false;
            }
        }
        return true;
    }
}
