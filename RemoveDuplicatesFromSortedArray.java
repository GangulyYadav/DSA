public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    static int removeDuplicates(int[] nums) {
        int i=0,j=1;

        while(j<nums.length){
            if(nums[i]!=nums[j] && i<j){
                nums[++i]=nums[j];
            }
            ++j;
        }

        return i+1;
    }
}
