package arraypractice;

import java.util.HashSet;
import java.util.Set;

import static utils.ArrayUtils.printArray;

public class DuplicateNumber2 {

    public static void main(String args[]){
        Integer arr[] = new Integer[]{1,3,4,2,3};
        Integer number = findRepeatedNumber(arr);
        System.out.println( "Number = " + number);
    }

    private static Integer findRepeatedNumber(Integer[] arr) {
        printArray(arr);
        Set<Integer> set = new HashSet<>();
        for(Integer element : arr){
            if(set.contains(element))
                return element;
            else
                set.add(element);
        }

        return -1;
    }

    //best solution from leetcode
    public int findDuplicate(int[] nums) {
        boolean[] flags=new boolean[nums.length-1];

        for(int i=0;i<nums.length;i++){
            if(flags[nums[i]-1]){
                return nums[i];
            }
            flags[nums[i]-1]=true;
        }
        return 0;
    }
}
