package Practice;// Find ceil element in a sorted array
// Ceil element : The smallest element greater than the target element

public class FindCeilElement {
    public static void main(String[] args) {
        int[] nums = {-12,-10,0,10,20,60};
        int target = 61;
        System.out.println(findCeilElement(nums,target));
    }

     static int findCeilElement(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(target>nums[end]){
            return -1;
        }
        while(start<=end){
            int mid = (int)(start+(end-start)/2);
            if(nums[mid]==target){
                return mid;
            }

            if(target>nums[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return start;

     }
}
