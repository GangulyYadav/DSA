package Practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-12,-10,0,10,20,60};
        int target = 2;
        System.out.println(binarySearch(nums,target));
    }

    static int binarySearch(int nums[],int target){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (int)(start+(end-start)/2);
            if(target>nums[mid]){
                start = mid + 1;
            }else if(target<nums[mid]){
                end = mid - 1;
            }else if(nums[mid]==target){
                return mid;
            }
        }

        return -1;
    }
}
