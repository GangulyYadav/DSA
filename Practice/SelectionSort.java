package Practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3,4,1,2,5};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(selection(nums)));
    }

    public static int[] selection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = findMaxIndex(nums,0,last);
            if(nums[maxIndex]>nums[last]){
                int temp = nums[maxIndex];
                nums[maxIndex] = nums[last];
                nums[last] = temp;
            }
        }
        return nums;
    }

    public static int findMaxIndex(int[] nums,int start, int end){
        int max = start;
        for (int i = 1; i < end; i++) {
            if(nums[max]<nums[i]){
                max = i;
            }
        }
        return max;
    }
}
