package utils;

public class ArrayUtils {

    public static void printArray(Integer[] arr) {
        System.out.print("[");
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }

    public static Integer[] splitArray(Integer start, Integer end, Integer[] arr) {
        Integer[] arr2 = new Integer[end-start];
        for(int i = 0 ; i<arr2.length; i++){
            arr2[i] = arr[start];
            start++;
        }
        return arr2;
    }
}
