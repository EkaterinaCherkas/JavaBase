package Task11;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        int[] arr = new int[100];
        newArray(arr);
    }

    public static void newArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
