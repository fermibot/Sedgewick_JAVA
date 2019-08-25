package com.sedgewick;

public class page_25_rank {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (key < a[mid]) return rank(key, a, low, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, high);
        else return mid;
    }

    public static void main(String[] args) {
        int rank = rank(1, new int[]{1, 2, 4, 10}, 1, 3);
        System.out.println("The calculated rank is " + rank);
    }
}
