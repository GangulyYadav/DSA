package Practice;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] nums = {-12,-10,0,10,20,60};
        int[] nums = {12,10,0,-10,-20,-60};
        int target = 1;
        System.out.println(orderAgnosticBinarySearch(nums,target));
    }

    static int orderAgnosticBinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean isAscending = false;

        if(nums[start]<nums[end]){
            isAscending = true;
        }
        while( start <= end ){
            int mid = (int)(start+(end-start)/2);
            if(nums[mid]==target){
                return mid;
            }

            if(isAscending){
                if(target > nums[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target < nums[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }


        return -1;
    }
}
