package Task14;

import java.util.Arrays;

public class TwoArguments {
    public static void main(String[] args) {
        int len = 10;
        int initialValue = 20;
        System.out.println(Arrays.toString(arrayFilling(len,initialValue)));
    }
    public static int[] arrayFilling(int len,int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len ; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
