package GFG;

public class FindPosInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target =100;

        System.out.println(findPos(nums,target));
    }

    static int findPos(int[] nums,int target){
        int start = 0;
        int end = 1;
        while(target>nums[end]){
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }


        return binarySearch(nums,target,start,end);
    }

    static int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<nums[mid]){
                end = mid - 1;
            }else if(target>nums[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
