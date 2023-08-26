package arraypractice;

import static utils.ArrayUtils.printArray;

public class SortColors4 {

    public static void main(String args[]){
        Integer arr[] = new Integer[]{1,1,2,2,1,0,2,0};
        sortColors(arr);
    }

    private static void sortColors(Integer[] arr) {
        printArray(arr);
        int count0 = 0;
        int count1 = 0;
        for(int value : arr){
            if(value == 0){
                count0++;
            }else if(value == 1){
                count1++;
            }
        }
        for(int i =0; i< arr.length;i++){
            if(i < count0){
                arr[i] = 0;
            }else if(i < count0+count1){
                arr[i] = 1;
            }else{
                arr[i] = 2;
            }
        }
        printArray(arr);
    }
}
