package Practice;

public class FindRotationCountInSortedArray {

        public static void main(String[] args) {
            int[] nums={4,5,6,7,2,3};

            System.out.println(countRotation(nums));
        }
        static int countRotation(int[] nums){
            int pivot = findPivot(nums);
            return nums.length-1 - pivot;
        }
        static int findPivot(int[] nums){
            int start = 0;
            int end = nums.length -1;

            while(start<=end){
                int mid = start + (end-start)/2;

                if(nums[mid]>nums[mid+1]){
                    return mid;
                }else if(nums[mid]<nums[mid-1]){
                    return mid-1;
                }

                if(nums[start]>nums[mid]){
                    end =  mid - 1;
                }else{
                    start = mid + 1;
                }
            }

            return -1;
        }
}
