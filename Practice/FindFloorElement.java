package Practice;// Find the floor element in a given sorted array
// Floor : The largest element smaller than the given element

public class FindFloorElement {
    public static void main(String[] args) {
        int[] nums = {-12,-10,0,10,20,60};
        int target = -13;
        System.out.println(findFloorElement(nums,target));
    }

    static int findFloorElement(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start<=end){
            int mid = (int)(start+(end-start)/2);
            if(nums[mid]==target){
                return mid;
            }

            if(target>nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return end;
    }
}
