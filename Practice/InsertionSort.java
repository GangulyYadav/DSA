package Practice;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {10,5,3,-2,0,8};
        System.out.println(Arrays.toString(insertionSort(nums)));
    }

    public static int[] insertionSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        return nums;
    }
}
