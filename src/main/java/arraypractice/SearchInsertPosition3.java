package arraypractice;

import utils.ArrayUtils;

import java.util.HashSet;
import java.util.Set;

import static utils.ArrayUtils.printArray;

public class SearchInsertPosition3 {

    public static void main(String args[]){
        Integer arr[] = new Integer[]{-1,1,2,5,6,9,13};
        Integer number = searchInsertPosition(arr,0);
        System.out.println( "Number = " + number);
    }

    private static Integer searchInsertPosition(Integer[] arr , Integer value) {
        printArray(arr);
        Integer index = -1;
        Integer mid = arr.length/2;
        if(arr.length == 0){
            return index+1;
        }
        if(value == arr[mid]){
            return mid;
        }else if(value < arr[mid]){
            index = searchInsertPosition(ArrayUtils.splitArray(0,mid,arr),value);
        }else{
            index = mid + 1 + searchInsertPosition(ArrayUtils.splitArray(mid + 1, arr.length, arr),value);
        }
        return index;
    }
}
