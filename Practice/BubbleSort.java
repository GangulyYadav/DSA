package Practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {-32,8,9,-1,0,10,12,14};
        System.out.println(Arrays.toString(nums));
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void bubble(int[] nums){
        boolean sorted;
        for(int i = 0; i<nums.length; i++){
            sorted = false;
            for(int j = 1; j<nums.length - i; j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    sorted = true;
                }
            }
            if(!sorted){
                break;
            }
        }
    }
}
