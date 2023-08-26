package arraypractice;

import static utils.ArrayUtils.printArray;

public class FirstLastElementInSortedArray5 {

    public static void main(String args[]){
        Integer arr[] = new Integer[]{5,7,7,8,8,10};
        printArray(findFirstLastIndex(arr,4));
    }

    private static Integer[] findFirstLastIndex(Integer[] arr, int value) {
        printArray(arr);
        int count0 = -1;
        int count1 = -1;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == value && count0 == -1){
                count0 = i;
            }else if(arr[i] == value){
                count1 = i;
            }else if(arr[i] != value && count0 != -1 && count1 != -1){
                break;
            }
        }
        if(count0 > count1)
            count1 = count0;
        return new Integer[]{count0,count1};
    }

    //best solution on leetcode

    public int[] searchRange(int[] nums, int target) {
        int x1 = binarySearch(nums, target);
        int[] ans = new int[2];
        if(x1 == -1) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        int x2 = binarySearch2(nums, target);
        ans[0] = x1;
        ans[1] = x2;
        return ans;
    }

    public int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int idx = -1;
        int start = 0, end = n-1;
        while(start <= end) {
            int mid = start +(end-start)/2;
            if(nums[mid] >= target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            if(nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }
    public int binarySearch2(int[] nums, int target) {
        int n = nums.length;
        int idx = -1;
        int start = 0, end = n-1;
        while(start <= end) {
            int mid = start +(end-start)/2;
            if(nums[mid] <= target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
            if(nums[mid] == target) {
                idx= mid;
            }
        }
        return idx;
    }
}
