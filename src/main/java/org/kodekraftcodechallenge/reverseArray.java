package org.kodekraftcodechallenge;

public class reverseArray {
    /*
    *   int[] inputArr = new int[] {1, 2, 3, 4, 5};
        // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(inputArr));
        revArr(inputArr);
        // [5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(inputArr))*/
// Big O(n) linear
    public static void revArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

    public String revArr2(int[] str){
        StringBuilder rev = new StringBuilder();

        int start =0;
        int end = str.length -1;

        while(start<end)
        {
            int tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;
            start ++;
            end --;
        }
        return rev.toString();
}}
