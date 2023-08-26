package arraypractice;

import utils.ArrayUtils;

public class BinarySearch1 {

    public static void main(String args[]){
        Integer arr[] = new Integer[]{-1,0,3,5,9,12};
        System.out.println(arr);
        Integer index = binarySearch(arr, 9);
        System.out.println( "Index = " + index);
    }

    private static Integer binarySearch(Integer[] arr, Integer value) {
        ArrayUtils.printArray(arr);
        Integer index = -1;
        Integer mid = arr.length/2;
        System.out.println("arr.length - " + arr.length);
        System.out.println("Mid - " + mid);
        if(arr.length == 0){
            return index;
        }
        if(value == arr[mid]){
            return mid;
        }else if(value < arr[mid]){
            index = binarySearch(ArrayUtils.splitArray(0,mid,arr),value);
        }else{
            Integer index2 = binarySearch(ArrayUtils.splitArray(mid + 1, arr.length, arr),value);
            if(index2 < 0)
                return index2;
            index = mid + 1 + index2;
        }

        return index;
    }

    //best solution on leetcode using recursion
    int binarySearch(int arr[], int left, int right, int x)
    {
        // Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices
        if (right >= left && left <= arr.length - 1) {

            int mid = left + (right - left) / 2;

            // If the element is present
            // at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, right, x);
        }

        // We reach here when element is not present in
        // array
        return -1;
    }
}
