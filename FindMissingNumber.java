// Leetcode Problem number 268
// Day 10 of 100DaysOfCode
// Author : Ganguly Yadav
// https://leetcode.com/problems/missing-number/
package LeetCode;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums= {3,0,1};
        System.out.println(missingNumber(nums));
    }

        static int missingNumber(int[] nums) {
            int i = 0;
            while(i<nums.length){
                int correct = nums[i];
                if(nums[i] < nums.length && nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else{
                    i++;
                }
            }

            for(int j = 0; j<nums.length; j++){
                if(nums[j] != j){
                    return j;
                }
            }

            return nums.length;
        }

        static void swap(int[] nums,int first, int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }

//        Do the sum from start to end index and reduce all the available elements
//    static int missingNumber(int[] nums) {
//        int sum = 0;
//        for(int i = 1; i <= nums.length ; i++) sum += i;
//        for(int i : nums) sum -= i;
//        if(sum == 0) return 0;
//        return sum;
//    }
}
