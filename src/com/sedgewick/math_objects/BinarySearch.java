package com.sedgewick.math_objects;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low);
            if (key < a[mid]) high = mid - 1;
            else if (key > a[mid]) high = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
