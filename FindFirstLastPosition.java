package LeetCode;

import java.util.Arrays;

public class FindFirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target=8;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int start = binarySearch(nums,target,true);
        int end = binarySearch(nums,target,false);


        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int binarySearch(int[] nums,int target,boolean findingStartIndex){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start<=end){

            int mid = (int)(start+(end-start)/2);
            if(target<nums[mid]){
                end = mid - 1;
            }else if(target>nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findingStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
